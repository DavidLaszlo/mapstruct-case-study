package com.github.davidl.mappers.basic.person;

import com.github.davidl.dto.PersonDTO;
import com.github.davidl.entity.Person;

public class PersonMapperManual {

	public PersonDTO personToPersonDTO(final Person person) {
		if (person == null) {
			return null;
		}

		final PersonDTO personDTO = new PersonDTO();

		personDTO.setName(person.getName());
		personDTO.setStreet(person.getStreet());
		personDTO.setCity(person.getCity());
		// will not set, to check it in the generated target files
		// personDTO.setPostCode( person.getPostCode() );

		return personDTO;
	}
}
