resource "google_cloud_run_service" "default" {
  name     = "cloudrun-srv"
  location = "us-central1"
  project = "devops05-290206"

  template {
    spec {
      containers {
        image = "gcr.io/devops05-290206/docker@sha256:d0b488c6dbb6f46b75abc1d3f7fe411d11081727445335c6a8b8582b784d28c6"
      }
    }
  }
}

data "google_iam_policy" "noauth" {
  binding {
    role = "roles/run.invoker"
    members = [
      "allUsers",
    ]
  }
}

resource "google_cloud_run_service_iam_policy" "noauth" {
  location    = google_cloud_run_service.default.location
  project     = google_cloud_run_service.default.project
  service     = google_cloud_run_service.default.name

  policy_data = data.google_iam_policy.noauth.policy_data
}