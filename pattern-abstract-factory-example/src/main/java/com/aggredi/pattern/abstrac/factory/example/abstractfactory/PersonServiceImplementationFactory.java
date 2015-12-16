package com.aggredi.pattern.abstrac.factory.example.abstractfactory;

import com.aggredi.pattern.abstrac.factory.example.abstractfactory.impl.PersonServiceDBCreator;
import com.aggredi.pattern.abstrac.factory.example.abstractfactory.impl.PersonServiceFileCreator;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonServiceImplementationFactory {

    public enum ServiceType{
        DB, FILE
    }

    public static PersonServiceCreator createServiceCreator(ServiceType serviceType) {
        switch (serviceType) {
            case DB:
                return new PersonServiceDBCreator();
            case FILE:
                return new PersonServiceFileCreator();
            default:
                throw new IllegalArgumentException("Not supported service type");
        }
    }
}
