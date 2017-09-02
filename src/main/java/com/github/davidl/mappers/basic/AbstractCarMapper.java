package com.github.davidl.mappers.basic;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.davidl.dto.CarDto;
import com.github.davidl.entity.Car;

@Mapper
public abstract class AbstractCarMapper {

	@Mappings({ @Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	public abstract CarDto carToCarDto(Car car);

}