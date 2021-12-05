package com.resume.Jeremiah.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @GetMapping("/shop")
    public String welcome() {
        return "shop/home";
    }

        @GetMapping("/shop/create")
        public String create() {
            return "shop/create";
        }
}