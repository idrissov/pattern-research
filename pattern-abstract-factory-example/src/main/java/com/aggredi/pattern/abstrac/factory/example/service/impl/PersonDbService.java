package com.aggredi.pattern.abstrac.factory.example.service.impl;

import com.aggredi.pattern.abstrac.factory.example.entity.Person;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonSerializer;
import com.aggredi.pattern.abstrac.factory.example.service.PersonService;

import java.sql.*;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonDbService implements PersonService {

    private PersonSerializer serializer;

    private String dbUrl;


    public PersonDbService(PersonSerializer serializer, String dbName) throws ClassNotFoundException, SQLException {
        this.serializer = serializer;

        dbUrl = dbName;

        Class.forName("org.h2.Driver");
        System.out.println("Connecting to a selected database...");
        try(Connection conn = DriverManager.getConnection(dbName, "sa", "");
                Statement statement = conn.createStatement()){

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS person (" +
                    "name VARCHAR (255)," +
                    "age INTEGER)");
            System.out.println("Connected database successfully...");

        }


    }

    @Override
    public void writePerson(Person person) {
        String serialize = serializer.serialize(person);
        try (Connection conn = DriverManager.getConnection(dbUrl, "sa", "");
             Statement statement = conn.createStatement()) {

            ResultSet resultSet = statement.executeQuery("select * from person where name='" + person.getName() + "'");
            if (resultSet.next()) {
                statement.executeUpdate("update person set name='Serik', age = 19 where name = 'serik");
            } else {
                //insert
                statement.executeUpdate("INSERT INTO person (name, age) VALUES ('Serik', 19)");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person readPerson(String name) throws SQLException {
        try (Connection conn = DriverManager.getConnection(dbUrl, "sa", "");
             Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * from person where name='" + name + "'");
            Person person = null;
            if (resultSet.last()) {
                person = new Person();
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));

            }
            return person;
        }
    }
}
