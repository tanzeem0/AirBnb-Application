package com.hotelbooking.project.airBnbApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/")
    public String redirectToSwagger() {
        // Redirects the root traffic directly to the Springdoc Swagger UI endpoint
        return "redirect:/swagger-ui/index.html";
    }
}
