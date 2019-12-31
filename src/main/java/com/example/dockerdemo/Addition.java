package com.example.dockerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Addition {


    @RequestMapping(value = "/add/{num1}/{num2}")
    public String addNum(@PathVariable int num1, @PathVariable int num2)
    {

        return ("Adding "+num1+ " and "+num2+" gives "+Integer.toString(num1+num2));
    }
}
