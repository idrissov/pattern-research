package com.aggredi.pattern.proxy.example.impl;

import com.aggredi.pattern.proxy.example.Person;
import com.aggredi.pattern.proxy.example.PersonService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class PersonServiceImplProxy implements PersonService {

    private PersonService personService;

    private Map<String, Person> personCache = new HashMap<>();

    public PersonServiceImplProxy(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public Person readPerson(String name) {
        Person person = personCache.get(name);
        if (person == null) {
            person = personService.readPerson(name);
            personCache.put(name, person);
        }
        return person;
    }
}
