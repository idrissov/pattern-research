package com.aggredi.composite.subordinates;

import com.aggredi.composite.SubordinatesContainer;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class Manager extends SubordinatesContainer {

    public Manager(String name) {
        super(name);
    }

    @Override
    public String nameOfPosition() {
        return "Manager";
    }
}
