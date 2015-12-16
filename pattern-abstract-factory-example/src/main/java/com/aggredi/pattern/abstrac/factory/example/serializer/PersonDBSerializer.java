package com.aggredi.pattern.abstrac.factory.example.serializer;

import com.aggredi.pattern.abstrac.factory.example.entity.Person;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonDBSerializer implements PersonSerializer {
    @Override
    public String serialize(Person person) {
        return null;
    }

    @Override
    public Person deserialize(String person) {
        return null;
    }
}
