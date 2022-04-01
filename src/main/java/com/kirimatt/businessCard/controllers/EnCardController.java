package com.kirimatt.businessCard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("en")
public class EnCardController {

    @GetMapping()
    public String getIndex() {
        return "en/index";
    }

    @GetMapping("/experience")
    public String getExperience() {
        return "en/experience";
    }

    @GetMapping("/stack")
    public String getStack() {
        return "en/technologies";
    }

    @GetMapping("/education")
    public String getEducation() {
        return "en/education";
    }

}
