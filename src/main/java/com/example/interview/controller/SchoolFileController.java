package com.example.interview.controller;

import com.example.interview.HelperService;
import com.example.interview.rest.RequestForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolFileController {
    private HelperService helperService;

    public SchoolFileController(HelperService helperService) {
        this.helperService = helperService;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping("/SchoolFile")
    public void print1(@RequestBody RequestForm requestForm) {
        helperService.print1(requestForm.getFileIds(), requestForm.getCollectionName());
    }
}
