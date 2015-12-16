package com.aggredi.pattern.abstrac.factory.example.abstractfactory.impl;

import com.aggredi.pattern.abstrac.factory.example.abstractfactory.PersonServiceCreator;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonFileSerializer;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonSerializer;
import com.aggredi.pattern.abstrac.factory.example.service.PersonService;
import com.aggredi.pattern.abstrac.factory.example.service.impl.PersonFileService;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonServiceFileCreator implements PersonServiceCreator {
    @Override
    public PersonSerializer createSerializer() {
        return new PersonFileSerializer();
    }

    @Override
    public PersonService createService(PersonSerializer serializer, String resourceName) {
        return new PersonFileService(serializer, resourceName);
    }
}
