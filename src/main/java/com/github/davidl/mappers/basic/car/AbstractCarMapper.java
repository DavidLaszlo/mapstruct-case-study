package com.github.davidl.mappers.basic.car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.github.davidl.dto.CarDto;
import com.github.davidl.dto.PersonDTO;
import com.github.davidl.entity.Car;
import com.github.davidl.entity.Person;

@Mapper
public abstract class AbstractCarMapper {

	// is it also possible to define an abstract method instead of an interface

	public CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mappings({ @Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	public abstract CarDto carToCarDto(Car car);

	public abstract PersonDTO personToPersonDTO(Person person);

}