package com.coopbank.iap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Manager {
    @GetMapping("/manager")
    public String getManagers(){
        return "managers";
    }

}
