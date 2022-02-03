package com.dxc.learning.personrestapi.controllers;

import java.time.LocalDate;
import java.util.List;

import com.dxc.learning.personrestapi.DTO.PersonDTO;
import com.dxc.learning.personrestapi.model.Person;
import com.dxc.learning.personrestapi.service.personService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Autowired
public class PersonController {

    @GetMapping({"","/"})
    public ResponseEntity<List<Person> getAll(){
        List<Person> persons = personService.getAllPersons();
        return ResponseEntity.status(HttpStatus.Ok).body(persons));

    }

    @PostMapping({ "", "/" })
    public ResponseEntity<PersonDTO> create(@RequestBody PersonDTO personReqObj) {
        Person person = modelMapper.map(personReqObj, Person.class);
        person.setCreationDate(LocalDate.now());
        personService.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

}
