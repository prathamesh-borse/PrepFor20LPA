package com.prep.PrepForJPMC.controller;

import com.prep.PrepForJPMC.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PrepController {

    @Autowired
    private SimpleService simpleService;

    @GetMapping
    public String returnHelloWorld(@RequestParam String name) {
        return simpleService.printHelloWorld(name);
    }

    @PostMapping
    public String printBody(@RequestBody String message) {
        return simpleService.printBodyMessage(message);
    }
}
