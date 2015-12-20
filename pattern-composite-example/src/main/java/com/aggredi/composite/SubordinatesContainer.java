package com.aggredi.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public abstract class SubordinatesContainer {

    private List<SubordinatesContainer> subordinates = new ArrayList<>();
    private String personName;

    @Override
    public String toString() {
        return "SubordinatesContainer{" +
                "subordinates=" + subordinates +
                ", personName='" + personName + '\'' +
                '}';
    }

    public SubordinatesContainer(String name) {
        this.personName = name;
    }

    public List<SubordinatesContainer> getSubordinates() {
        return subordinates;
    }

    public SubordinatesContainer getSubordinate(int index) {
        return subordinates.get(index);
    }

    public void addSubordinate(SubordinatesContainer subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(SubordinatesContainer subordinate) {
        subordinates.remove(subordinate);
    }

    public abstract String nameOfPosition();
}
