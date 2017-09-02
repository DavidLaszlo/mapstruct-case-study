package first;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CarMapper {

	@Mappings({ @Mapping(source = "make", target = "manufacturer"),
			@Mapping(source = "numberOfSeats", target = "seatCount") })
	CarDto carToCarDto(Car car);

	// @Mapping(source = "name", target = "fullName")
	// PersonDto personToPersonDto(Person person);
}