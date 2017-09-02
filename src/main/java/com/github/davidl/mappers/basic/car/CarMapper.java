package com.github.davidl.mappers.basic.car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.github.davidl.dto.CarDto;
import com.github.davidl.entity.Car;
import com.github.davidl.mappers.basic.person.PersonMapper;

@Mapper(uses = PersonMapper.class)
public interface CarMapper {

	// it is good practice to have only one instance
	// there are other possibilities to instantiate mappers, for instance with CDI
	public CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	// between Car and CarDTO just those fields must be mapped which do have different names
	// other fields will be automatically mapped
	// even the types differ, see previousOwnerCount, previousOwners, ownersPreviousCars;
	@Mappings({ //
			@Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	public CarDto carToCarDto(Car car);

	// here we do not need the person Mapper method like in the CarMapper class, because we use the
	// uses=PersonMapper.class property
}