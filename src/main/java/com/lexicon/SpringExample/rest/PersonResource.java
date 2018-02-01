package com.lexicon.SpringExample.rest;

import com.lexicon.SpringExample.models.Person;
import com.lexicon.SpringExample.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

    @RestController
    @Path("/person")
    public class PersonResource {

	@Autowired
	PersonRepository dao;
		
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePerson(Person person) throws URISyntaxException {
		dao.persistPerson(person);
	return	Response
	.created(new URI("localhost:8080/personNotes/rest/person")).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllPersons(){
		return Response.ok(dao.getAllPerson()).build();
		//return dao.getAllPerson();
	}
	
	@POST
	@Path("/{id}/note/")
	public Response addNoteToPerson(@PathParam("id") Long id, @QueryParam("text") String text) throws URISyntaxException {
		dao.addNoteToPerson(id , text);
		return	Response
				.created(new URI("localhost:8080/personNotes/rest/person/" + id +"/note/" + text)).build();
	}

}
