package com.aggredi.pattern.abstrac.factory.example.abstractfactory.impl;

import com.aggredi.pattern.abstrac.factory.example.abstractfactory.PersonServiceCreator;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonDBSerializer;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonSerializer;
import com.aggredi.pattern.abstrac.factory.example.service.PersonService;
import com.aggredi.pattern.abstrac.factory.example.service.impl.PersonDbService;

import java.sql.SQLException;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonServiceDBCreator implements PersonServiceCreator {
    @Override
    public PersonSerializer createSerializer() {
        return new PersonDBSerializer();
    }

    @Override
    public PersonService createService(PersonSerializer serializer, String resourceName) throws SQLException, ClassNotFoundException {
        return new PersonDbService(serializer, resourceName);
    }
}
