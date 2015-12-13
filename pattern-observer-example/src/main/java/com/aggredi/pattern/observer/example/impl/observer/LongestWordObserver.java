package com.aggredi.pattern.observer.example.impl.observer;

import com.aggredi.pattern.observer.example.WordEvent;
import com.aggredi.pattern.observer.example.WordObserver;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class LongestWordObserver implements WordObserver {

    private String longestWord = "";
    @Override
    public void observe(WordEvent event) {

    }
}
