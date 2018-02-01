package com.lexicon.SpringExample.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lexicon.SpringExample.models.Person;


@Repository
@Transactional
public class PersonRepositoryImplementation implements PersonRepository{
	@Autowired
	EntityManager em;

	@Override
	public void persistPerson(Person person) {
	em.persist(person);
		
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNoteToPerson() {
		// TODO Auto-generated method stub
		
	}

}
