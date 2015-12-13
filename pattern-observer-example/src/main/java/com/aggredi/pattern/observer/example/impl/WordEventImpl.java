package com.aggredi.pattern.observer.example.impl;

import com.aggredi.pattern.observer.example.WordEvent;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class WordEventImpl implements WordEvent {

    private String word;

    public WordEventImpl(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
