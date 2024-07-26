package com.example.interview.controller;

import com.example.interview.HelperService;
import com.example.interview.rest.RequestForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkFileController {

    private HelperService helperService;

    public WorkFileController(HelperService helperService) {
        this.helperService = helperService;
    }

    @PostMapping("/WorkFile")
    public void print2(@RequestBody RequestForm requestForm) {
        helperService.print2(requestForm.getFileIds(), requestForm.getCollectionName());
    }
}
