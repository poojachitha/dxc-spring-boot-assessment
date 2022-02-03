package com.dxc.learning.personrestapi.service;

import java.util.List;

import com.dxc.learning.personrestapi.model.Person;

public interface personService {

    public Person getPersonById(int id);

    public Person getPersonByEmail(String email);

    public static Person createPerson(Person person) {
        // TODO Auto-generated method stub
        return null;
    }

    public Person updatePerson(Person person);

    public void deletePerson(int id);

    public static List<Person> getAllPersons() {
        // TODO Auto-generated method stub
        return null;
    }

}
