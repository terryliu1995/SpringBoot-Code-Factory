package com.example.joke.Controllers;

import com.example.joke.services.JokeService;
import com.example.joke.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        //prepare POJO data model to page
        model.addAttribute("joke", jokeService.getJoke());
        // call thymleaf get chucknorris page
        return "chucknorris";
    }
}
