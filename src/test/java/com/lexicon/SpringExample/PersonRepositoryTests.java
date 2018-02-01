package com.lexicon.SpringExample;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.lexicon.SpringExample.models.Person;
import com.lexicon.SpringExample.repositories.PersonRepository;
import com.lexicon.SpringExample.repositories.PersonRepositoryImplementation;

@RunWith(SpringRunner.class)
@Import(PersonRepositoryImplementation.class)
@DataJpaTest
@Transactional
public class PersonRepositoryTests {

	@Autowired
	PersonRepository personRepository;
	
	@Test
	public void testThatPersonIsPersisted() {
		Person person = new Person(null, "Prathusha", "Pandipati");
		personRepository.persistPerson(person);
		Assert.assertNotNull(person.getId());
		
	}

}
