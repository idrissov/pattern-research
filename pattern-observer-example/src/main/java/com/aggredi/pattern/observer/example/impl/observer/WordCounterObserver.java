package com.aggredi.pattern.observer.example.impl.observer;

import com.aggredi.pattern.observer.example.WordEvent;
import com.aggredi.pattern.observer.example.WordObserver;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class WordCounterObserver implements WordObserver {

    private int wordCount;

    @Override
    public void observe(WordEvent event) {
        wordCount++;
    }
}
