package com.aggredi.pattern.abstrac.factory.example.serializer;

import com.aggredi.pattern.abstrac.factory.example.entity.Person;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonFileSerializer implements PersonSerializer {
    @Override
    public String serialize(Person person) {
        String s = "Name:" + person.getName() + ", Age:" + person.getAge();
        return s;
    }

    @Override
    public Person deserialize(String person) {
        System.out.println(person);
        String[] split = person.split(",");
        if (split.length != 2) {
            throw new IllegalArgumentException("wrong format");
        }
        Person personObj = new Person();
        personObj.setName(split[0].substring("Name:".length() +1 ));
        personObj.setAge(new Integer(split[1].substring("Age:".length()+1)));
        return personObj;
    }
}
