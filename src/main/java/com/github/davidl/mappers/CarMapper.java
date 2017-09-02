package com.github.davidl.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.davidl.dto.CarDto;
import com.github.davidl.entity.Car;

@Mapper
public interface CarMapper {

	@Mappings({ @Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	public CarDto carToCarDto(Car car);

}