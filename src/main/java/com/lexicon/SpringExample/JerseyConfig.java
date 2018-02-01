package com.lexicon.SpringExample;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;

import com.lexicon.SpringExample.rest.PersonResource;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfig {
	
	@PostConstruct
	private void init() {
		registerClasses(PersonResource.class);
		
	}

	private void registerClasses(Class<PersonResource> class1) {
		// TODO Auto-generated method stub
		
	}

}
