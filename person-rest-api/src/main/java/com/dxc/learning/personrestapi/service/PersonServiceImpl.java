package com.dxc.learning.personrestapi.service;

import java.util.List;

import com.dxc.learning.personrestapi.controllers.Autowired;
import com.dxc.learning.personrestapi.model.Person;
import com.dxc.learning.personrestapi.repository.personRepository;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements personService {

    @Autowired
    private personRepository personRepository;

    @Override
    public Person getPersonById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person getPersonByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person createPerson(Person person) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletePerson(int id) {
        Person person = getPersonById(id);
        personRepository.delete(person);

    }

    @Override
    public List<Person> getAllPersons() {

        return personRepository.findAll();
    }

}
