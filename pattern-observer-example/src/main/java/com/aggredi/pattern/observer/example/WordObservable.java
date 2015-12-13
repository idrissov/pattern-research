package com.aggredi.pattern.observer.example;

/**
 * Created by Serik Idrissov
 * 12/12/15
 */
public interface WordObservable {


    void addObserver(WordObserver observer);

    void removeObserver(WordObserver observer);

    void notifyObservers(WordEvent event);
}
