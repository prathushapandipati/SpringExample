package com.lexicon.SpringExample.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;

	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String firstName;
	
	private String lastName;
	
	@OneToMany(cascade = CascadeType.ALL , fetch=FetchType.EAGER)
	@JoinColumn(name = "PERSON_ID")
	private List<Note> notes = new ArrayList<Note>();

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	
	//Make person to an entity, with attribute firstName, lastName
	//Make a reference to List of Note (oneToMany)
	//Create Note entity with String attribute text
	//Check h2console
	//Research online for correct JPA annotations
	  
	
	
}
