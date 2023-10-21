package com.walletpro.walletproapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/")
    public String getPage() {
        return "Welcome";
    }


}
