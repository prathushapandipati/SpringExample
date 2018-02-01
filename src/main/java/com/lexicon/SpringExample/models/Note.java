package com.lexicon.SpringExample.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id; 
	
	private String text;
	
	public Note() {
		
	}
	
	public Note(String text) {
		this.text=text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
		
	
	
}
