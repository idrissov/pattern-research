package com.aggredi.pattern.abstrac.factory.example.service.impl;

import com.aggredi.pattern.abstrac.factory.example.entity.Person;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonSerializer;
import com.aggredi.pattern.abstrac.factory.example.service.PersonService;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
public class PersonFileService implements PersonService {

    private Path file;

    private PersonSerializer serializer;

    public PersonFileService(PersonSerializer serializer, String fileName) {
        file = Paths.get(fileName);
        this.serializer = serializer;
    }

    @Override
    public void writePerson(Person person) throws IOException {
        List<String> lines = Arrays.asList(serializer.serialize(person));
        Files.write(file, lines, Charset.forName("UTF-8"));
    }

    @Override
    public Person readPerson(String name) throws IOException {
        List<String> strings = Files.readAllLines(file);
        Optional<String> first = strings.stream().filter(person -> person.contains(name)).findFirst();

        return serializer.deserialize(first.get());
    }
}
