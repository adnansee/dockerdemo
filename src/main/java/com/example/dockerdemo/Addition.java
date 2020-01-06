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

    @RequestMapping(value = "/")
    public String welcomeScreen()
    {

        //return ("--------YAML AUTO--------- SEEMS TO BE WORKING FOLKS --------------------- Click the link   http://localhost:8080/add/2/4 ");

        return ("<!DOCTYPE html>\n" +
                "<html>\n" +
                "   <head>\n" +
                "      <title>HTML Image as link</title>\n" +
                "   </head>\n" +
                "   <body>\n"+
"<p> MORDY GREY THE CAT THE SLEEPY DEVELOPER</p>"+
                "         <img src=\"https://picsum.photos/1200/1300\"\n" +
                "         width=1000\" height=\"800\">\n" +
                "      </a>\n" +
                "   </body>\n" +
                "</html>");
    }
}
