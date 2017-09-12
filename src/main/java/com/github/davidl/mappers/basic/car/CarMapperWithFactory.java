package com.github.davidl.mappers.basic.car;

import org.mapstruct.Mapper;

import com.github.davidl.dto.CarDto;
import com.github.davidl.entity.Car;
import com.github.davidl.factories.DtoFactory;
import com.github.davidl.factories.EntityFactory;
import com.github.davidl.mappers.basic.person.PersonMapper;

@Mapper(uses = { DtoFactory.class, EntityFactory.class, PersonMapper.class })
public interface CarMapperWithFactory {

	CarDto carToCarDto(Car car);

	Car carDtoToCar(CarDto carDto);
}