package com.example.SampleApp.service;

import com.example.SampleApp.dao.PersonDAO;
import com.example.SampleApp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService
{
    @Autowired
    private final PersonDAO personDAO;

    public PersonService(@Qualifier("fakeDao") PersonDAO personDAO)
    {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person)
    {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople()
    {
        return personDAO.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id)
    {
        return personDAO.selectPersonById(id);
    }

    public int deletePerson(UUID id)
    {
        return personDAO.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person newPerson)
    {
        return personDAO.updatePersonById(id, newPerson);
    }
}
