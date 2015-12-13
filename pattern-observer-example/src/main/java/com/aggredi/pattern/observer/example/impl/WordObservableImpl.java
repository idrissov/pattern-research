package com.aggredi.pattern.observer.example.impl;

import com.aggredi.pattern.observer.example.WordEvent;
import com.aggredi.pattern.observer.example.WordObservable;
import com.aggredi.pattern.observer.example.WordObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class WordObservableImpl implements WordObservable {

    private List<WordObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(WordObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WordObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(final WordEvent event) {
        observers.stream().forEach(o -> o.observe(event));
    }
}
