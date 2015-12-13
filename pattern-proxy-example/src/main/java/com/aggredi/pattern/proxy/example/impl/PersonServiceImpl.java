package com.aggredi.pattern.proxy.example.impl;

import com.aggredi.pattern.proxy.example.Person;
import com.aggredi.pattern.proxy.example.PersonService;

import java.util.ResourceBundle;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class PersonServiceImpl implements PersonService {

    private ResourceBundle resourceBundle = ResourceBundle.getBundle("person");

    @Override
    public Person readPerson(String name) {
        String personName = resourceBundle.getString(name);
        return new Person(personName);
    }
}
