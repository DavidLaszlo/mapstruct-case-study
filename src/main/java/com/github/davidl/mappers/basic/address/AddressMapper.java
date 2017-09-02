package com.github.davidl.mappers.basic.address;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.github.davidl.dto.DeliveryAddressDTO;
import com.github.davidl.entity.Car;
import com.github.davidl.entity.Person;

@Mapper
public interface AddressMapper {

	// it is good practice to have only one instance
	// there are other possibilities to instantiate mappers, for instance with CDI
	public AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

	// mappings can be made from different objects to same target object
	// nesting can go until arbitrary depths
	@Mapping(source = "car.name", target = "carName")
	@Mapping(source = "person.name", target = "name")
	// expressions or other method calls if needed can be called
	@Mapping(expression = "java(buildAddress(person))", target = "concatenatedAddress")
	public DeliveryAddressDTO mapToDeliveryAddress(Car car, Person person);

	default String buildAddress(final Person person) {
		return String.format("%s Street no 1, %S, %s", person.getStreet(), person.getPostCode(), person.getCity());
	}

	// ambiguity for the target field DeliveryAddressDTOname
	// possible sources as seen also above: car.name and person.name
	// public void mapToDeliveryAddress(Car car, Person person, @MappingTarget DeliveryAddressDTO deliveryAddress);

	// additionally the object could also be updated and returned at the same time
	@Mapping(source = "car.name", target = "carName")
	@Mapping(source = "person.name", target = "name")
	@Mapping(expression = "java(buildAddress(person))", target = "concatenatedAddress")
	public DeliveryAddressDTO mapToDeliveryAddress(Car car, Person person,
			@MappingTarget DeliveryAddressDTO deliveryAddress);
}
