package com.ticoyk.sfgjokesapp.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Joke {

    private String text;

    public Joke(){
        this.text = "Batatinha";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
