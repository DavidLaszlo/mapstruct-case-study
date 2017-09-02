package com.github.davidl.mappers.basic.car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.davidl.dto.CarDto;
import com.github.davidl.dto.PersonDTO;
import com.github.davidl.entity.Car;
import com.github.davidl.entity.Person;

// The generated mapper implementation will be marked with the @ApplicationScoped annotation
// and thus can be injected into fields, constructor arguments etc. using the @Inject annotation:
@Mapper(componentModel = "cdi")
public interface CarMapperCDI {

	// between Car and CarDTO just those fields must be mapped which do have different names
	// other fields will be automatically mapped
	// even the types differ, see previousOwnerCount, previousOwners, ownersPreviousCars;
	@Mappings({ //
			@Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	public CarDto carToCarDto(Car car);

	// carToCarDto method requires a method to be able to map the Car.driver object to CarDTO.driver
	// see reason at http://mapstruct.org/documentation/stable/reference/html/#mapping-object-references
	public PersonDTO personToPersonDTO(Person person);

}