package com.ticoyk.sfgjokesapp.service;

import com.ticoyk.sfgjokesapp.model.Joke;

import org.springframework.stereotype.Service;

@Service("norrisJokeService")
public class NorrisJokeService implements JokeService {

    private Joke joke;

    public NorrisJokeService(Joke joke){
        this.joke = joke;
    }

    public Joke getJoke(){
        return joke;
    }
    
}
