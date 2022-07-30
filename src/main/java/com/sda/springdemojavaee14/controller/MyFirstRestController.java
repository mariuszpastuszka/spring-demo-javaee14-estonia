package com.sda.springdemojavaee14.controller;

import com.sda.springdemojavaee14.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController creates new Spring bean based on the class
// bean = component = managed object (object created by Spring for us)
@RestController
public class MyFirstRestController {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);

    private final GreetingService greetingService;

//    @Autowired - it's optional
    // dependency injection = providing required collaborators/dependencies by Spring
    public MyFirstRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // @GetMapping means
    // - code of the method will be run when we hit endpoint
    // - we use exact HTTP method
    @GetMapping("/say-hello")
    public String hello() {
        // TODO: explain logger level
        log.info("hello method was called.");

        return "Welcome to spring class!!!";
    }

    // example query link from google:
    // https://www.google.com/search?q=Estonia
    // server: https://www.google.com
    // /search: application (endpoint) on the server
    // ? : query separator
    // q=Estonia, q: parameter name, Estonia is value for q parameter
    // & is used if more parameters are coming
    // /greeting?name=Mariusz&surname=Pastuszka
    @GetMapping("/greeting")
    public String greetUser(@RequestParam(value = "name", defaultValue = "Jan") String firstName,
                            @RequestParam(value = "surname", defaultValue = "Kowalski") String surname) {
        log.info("greetUser called with params: name: [{}], surname: [{}]", firstName, surname); // String.format("name: %s", name);

        return greetingService.makeSomeGreetingToUser(firstName + " " + surname);
    }
}
