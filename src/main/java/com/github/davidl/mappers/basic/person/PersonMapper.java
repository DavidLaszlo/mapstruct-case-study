package com.github.davidl.mappers.basic.person;

import org.mapstruct.Mapper;

import com.github.davidl.dto.PersonDTO;
import com.github.davidl.entity.Person;

@Mapper
public interface PersonMapper {

	public abstract PersonDTO personToPersonDTO(Person person);

	public abstract Person personDTOToPerson(PersonDTO person);

}
