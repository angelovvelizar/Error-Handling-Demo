package com.example.errorsdemo.web;

import com.example.errorsdemo.web.errors.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("/products/{id}")
    public ModelAndView getProduct(@PathVariable Long id){

        throw new ObjectNotFoundException("Object you are searching for with id " + id + " is not found!");
    }

    /*@ExceptionHandler(ObjectNotFoundException.class)
    public ModelAndView handleError(ObjectNotFoundException e){
        ModelAndView modelAndView = new ModelAndView("object-not-found");
        modelAndView.addObject("message", e.getMessage());
        modelAndView.setStatus(HttpStatus.NOT_FOUND);
        return modelAndView;
    }*/


}
