package com.ticoyk.sfgjokesapp.controller;

import com.ticoyk.sfgjokesapp.service.JokeService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(@Qualifier("norrisJokeService") JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
    
}
