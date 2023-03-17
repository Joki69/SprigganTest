package com.example.consumingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(PopulationController.POPULATION)
public class PopulationController {
    public static final String POPULATION = "/population";

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String getPopulation(Model model) {

        Population [] p = greetingService.getPopulation();
        System.out.println(p);
        model.addAttribute("Population",p);
        return "population";

    }
}
