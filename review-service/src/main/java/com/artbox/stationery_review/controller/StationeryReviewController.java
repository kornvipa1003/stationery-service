package com.artbox.stationery_review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class StationeryReviewController {

    @GetMapping("/test")
    public String test()
    {
        return "This is Stationery Review Service";
    }
}
