package com.kirimatt.businessCard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ru")
public class RuCardController {

    @GetMapping()
    public String getIndex() {
        return "ru/index";
    }

    @GetMapping("/experience")
    public String getExperience() {
        return "ru/experience";
    }

    @GetMapping("/stack")
    public String getStack() {
        return "ru/technologies";
    }

    @GetMapping("/education")
    public String getEducation() {
        return "ru/education";
    }

}
