package com.aggredi.pattern.abstrac.factory.example.abstractfactory;

import com.aggredi.pattern.abstrac.factory.example.serializer.PersonSerializer;
import com.aggredi.pattern.abstrac.factory.example.service.PersonService;

import java.sql.SQLException;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public interface PersonServiceCreator {

    PersonSerializer createSerializer();

    PersonService createService(PersonSerializer serializer, String resourceName) throws SQLException, ClassNotFoundException;

}
