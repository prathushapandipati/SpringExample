package com.lexicon.SpringExample.repositories;

import java.util.List;

import com.lexicon.SpringExample.models.Person;

public interface PersonRepository {
   void persistPerson(Person person);
   List<Person> getAllPerson();
   void addNoteToPerson(Long id, String text);
   
	
	
	
	
}
