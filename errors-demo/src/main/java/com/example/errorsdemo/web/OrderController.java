package com.example.errorsdemo.web;

import com.example.errorsdemo.web.errors.ObjectNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    @GetMapping("/orders/{id}")
    public ModelAndView getProduct(@PathVariable Long id){

        throw new ObjectNotFoundException("Object you are searching for with id " + id + " is not found!");
    }
}
