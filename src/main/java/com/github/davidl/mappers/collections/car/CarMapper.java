package com.github.davidl.mappers.collections.car;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.davidl.dto.CarDto;
import com.github.davidl.entity.Car;
import com.github.davidl.mappers.basic.person.PersonMapper;

@Mapper(uses = PersonMapper.class)
public interface CarMapper {

	Set<String> integerSetToStringSet(Set<Integer> integers);

	List<CarDto> carsToCarDtos(List<Car> cars);

	@Mappings({ //
			@Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	CarDto carToCarDto(Car car);
}
