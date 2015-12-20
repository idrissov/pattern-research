package com.aggredi.composite;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public interface Organization {

    void setName(String name);

    String getName();

    SubordinatesContainer getHead();

    void setHead(SubordinatesContainer head);
}
