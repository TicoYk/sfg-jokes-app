package com.ticoyk.sfgjokesapp.service;

import com.ticoyk.sfgjokesapp.model.Joke;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service("norrisJokeService")
public class NorrisJokeService implements JokeService {

    private Joke joke;
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public NorrisJokeService(Joke joke){
        this.joke = joke;
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public Joke getJoke(){
        this.joke.setText(chuckNorrisQuotes.getRandomQuote());
        return joke;
    }
    
}
