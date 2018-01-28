package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ad on 1/28/2018.
 */
@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute Exercise exercise){
        System.out.println("Time set: " + exercise.getMinutes());
        return "addMinutes";
    }
}
