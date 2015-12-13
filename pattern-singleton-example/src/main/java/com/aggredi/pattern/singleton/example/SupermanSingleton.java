package com.aggredi.pattern.singleton.example;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public enum  SupermanSingleton {

    INSTANCE;

    public static SupermanSingleton getInstance() {
        return INSTANCE;
    }
}
