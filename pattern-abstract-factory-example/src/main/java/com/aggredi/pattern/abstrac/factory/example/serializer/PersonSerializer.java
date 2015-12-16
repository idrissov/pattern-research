package com.aggredi.pattern.abstrac.factory.example.serializer;

import com.aggredi.pattern.abstrac.factory.example.entity.Person;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public interface PersonSerializer {

    String serialize(Person person);

    Person deserialize(String person);
}
