package com.cgstocksiteapi.cgstocksite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {

    @GetMapping(path="/users")
    public String sendMessage() {
        return "hi";

    }

}