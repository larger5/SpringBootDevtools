package com.example.springbootdevtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongcunlin
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "hello123";
    }
}
