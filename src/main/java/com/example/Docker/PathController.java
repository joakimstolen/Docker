package com.example.Docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {


    @GetMapping(path = "/")
    public String home(){
        return "Welcome to homepage. Try entering /hello or /creator";
    }


    @GetMapping(path = "/hello")
    public String ping(){
        return "Hello to you! ";
    }

    @GetMapping(path = "/creator")
    public String creator(){
        return "Hello creator, does this work?! ";
    }

    @GetMapping(path = "/pong")
    public String pong(){
        return "ping is the word";
    }





    @GetMapping(path = "/pingpong")
    public String pingPong(){
        return "pingPong pingpong";
    }

    @GetMapping(path = "/user")
    public String helloCreator(){
        return "hello user";
    }


}

