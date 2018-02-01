package com.lexicon.SpringExample.repositories;
import com.lexicon.SpringExample.models.Note;
import com.lexicon.SpringExample.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepositoryImplementation implements PersonRepository {


	@Autowired
	EntityManager em;
	
	/* (non-Javadoc)
	 * @see lexicon.PersonRepository#persistPerson(lexicon.Person)
	 */
	@Override
	public void persistPerson(Person person) {
		em.persist(person);
		}
	
	/* (non-Javadoc)
	 * @see lexicon.PersonRepository#getAllPerson()
	 */
	@Override
	public List<Person> getAllPerson(){
		TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
		return query.getResultList();
	}

	/* (non-Javadoc)
	 * @see lexicon.PersonRepository#addNoteToPerson(java.lang.Long, java.lang.String)
	 */
	@Override
	public void addNoteToPerson(Long id, String text) {
		Person person = em.find(Person.class, id);
		person.getNotes().add(new Note(text));
		em.merge(person);
	}
	
	
	

}
