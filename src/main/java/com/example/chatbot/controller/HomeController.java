package com.example.chatbot.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() throws IOException {
        Resource resource = new ClassPathResource("static/pad.html");
        return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }

    @GetMapping("/chat")
    public String chat() {
        return "redirect:/index.html";
    }

    @GetMapping(value = "/{documentId}", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String document(@PathVariable String documentId) throws IOException {
        // Serve the pad.html for any document URL
        Resource resource = new ClassPathResource("static/pad.html");
        return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }
}
