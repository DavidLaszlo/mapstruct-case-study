package com.github.davidl.businesss;

import javax.inject.Inject;

import com.github.davidl.dto.CarDto;
import com.github.davidl.entity.Car;
import com.github.davidl.mappers.basic.car.CarMapper;
import com.github.davidl.mappers.basic.car.CarMapperCDI;

public class BusinessService {

	// non CDI use
	private final CarMapper carMapper = CarMapper.INSTANCE;

	// CDI use
	@Inject
	private CarMapperCDI carMapperCDI;

	public void carMapperCall() {
		final Car carEntity = new Car(); // we will not fill right now the fields
		final CarDto carDto = carMapper.carToCarDto(carEntity);
		// do whatewer you want with carDTO
	}

	public void carMapperCdiCall() {
		final Car carEntity = new Car(); // we will not fill right now the fields
		final CarDto carDto = carMapperCDI.carToCarDto(carEntity);
		// do whatewer you want with carDTO
	}

}
