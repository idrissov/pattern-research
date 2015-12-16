package com.aggredi.pattern.abstrac.factory.example.service;

import com.aggredi.pattern.abstrac.factory.example.entity.Person;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public interface PersonService {

    void writePerson(Person person) throws IOException;

    Person readPerson(String name) throws IOException, SQLException;
}
