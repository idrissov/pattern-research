package com.aggredi.observer.pattern.example;

import com.aggredi.pattern.observer.example.WordEvent;
import com.aggredi.pattern.observer.example.WordObservable;
import com.aggredi.pattern.observer.example.impl.WordEventImpl;
import com.aggredi.pattern.observer.example.impl.WordObservableImpl;
import com.aggredi.pattern.observer.example.impl.observer.LineCounterObserver;
import com.aggredi.pattern.observer.example.impl.observer.LongestWordObserver;
import com.aggredi.pattern.observer.example.impl.observer.ReverseCodeObserver;
import com.aggredi.pattern.observer.example.impl.observer.WordCounterObserver;
import org.junit.Test;

import java.util.ResourceBundle;

/**
 * Created by Serik Idrissov
 * 12/12/15
 */
public class TestObservable {

    private static ResourceBundle bundle = ResourceBundle.getBundle("text");

    @Test
    public void testObservable() {

        String testString = bundle.getString("test.text");

        WordObservable observable = new WordObservableImpl();

        observable.addObserver(new LineCounterObserver());
        observable.addObserver(new LongestWordObserver());
        observable.addObserver(new ReverseCodeObserver());
        observable.addObserver(new WordCounterObserver());

        String[] split = testString.split(" ");

        for (String s : split) {

            WordEvent wordEvent = new WordEventImpl(s);
            observable.notifyObservers(wordEvent);
        }



    }
}
