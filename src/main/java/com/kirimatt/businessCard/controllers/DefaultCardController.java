package com.kirimatt.businessCard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class DefaultCardController {
    @GetMapping()
    public String getIndex() {
        return "ru/index";
    }
}
