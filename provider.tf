provider "google" {
  credentials = file("google-key.json")
  project     = "devopscube-demo"
  region      = "us-central1"
  zone        = "us-central1-c"
}

