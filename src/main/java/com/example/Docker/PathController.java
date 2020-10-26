package com.example.Docker;


import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PathController {




//////////////////influx

    //private MeterRegistry meterRegistry;


//    @Autowired
//    public PathController(MeterRegistry meterRegistry) {
//        this.meterRegistry = meterRegistry;
//    }


//    @PostMapping(path = "/tx", consumes = "application/json", produces = "application/json")
//    public void addMember(@RequestBody Transaction tx) {
//        meterRegistry.counter("txcount2", "currency", tx.getCurrency()).increment();
//        meterRegistry.counter("txcount3", "toAccount", tx.getToAccount()).increment();
//        meterRegistry.gauge("txcount4", 3);
//
//    }
//////////////////influx end

    private static final Logger logger = LoggerFactory.getLogger(PathController.class.getName());

    @GetMapping(path = "/")
    public String home(){
        logger.info("Testing logz.io!");
        return "Welcome to homepage. Try entering /hello or /creator";
    }


    @GetMapping(path = "/hello")
    public String ping(){
        logger.warn("Homepage is almost empty");
        return "Hello to you! ";
    }

    @GetMapping(path = "/pr")
    public String pr(){
        return "Does the pull request and travis push work?";
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




}

