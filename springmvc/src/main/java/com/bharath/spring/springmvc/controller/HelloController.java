package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador Hello.
 *
 * @author jose casal
 */
@Controller//<-- Indica que esta clase ahora es un controlador por lo tanto ahora puede recibir peticiones HTTP
public class HelloController {

    @RequestMapping("/hello")//<-- Establece la dirección URL
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        /*Se agregan valores primitivos para ser transferidos directamente a las vistas. Mediante una clave y valor*/
        modelAndView.addObject("id", 123);
        modelAndView.addObject("name", "Bharath");
        modelAndView.addObject("salary", 10000);
        return modelAndView;
    }

}
