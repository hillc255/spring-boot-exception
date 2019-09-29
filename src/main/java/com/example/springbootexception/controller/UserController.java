package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    //http://localhost:8080/add
    // add.html has no value so
    // error.html page will default
    // result:  Error Page Using Error.html page

    @RequestMapping("/add")
    public String add() {
        int num = 10 / 0;
        return "add";
    }

    //Add new methods in UserController below
    // to show arithmetic exception AND nullpointer exception

    // localhost:8080/add      //shows arithmetic exception
    // localhost:8080/update   //shows nullpointerexception

    @RequestMapping("/update")
    public String update() {
        String name = null;
        name = name.toLowerCase(); // this should cause null pointer exception
        return "update";
    }

    //Comment out Exceptions in UserControler when RoleController added
    // Global Exceptions will handle all exception cases

//    @ExceptionHandler(value={java.lang.ArithmeticException.class})
//    public ModelAndView handlerArithmeticException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("mathError");
//        return modelAndView;
//    }
//
//    @ExceptionHandler(value={java.lang.NullPointerException.class})
//    public ModelAndView handlerNullPointerException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("nullPointerError");
//        return modelAndView;
//    }
}