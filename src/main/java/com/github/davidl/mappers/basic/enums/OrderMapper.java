package com.github.davidl.mappers.basic.enums;

import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;

import com.github.davidl.enums.ExternalOrderType;
import com.github.davidl.enums.OrderType;

@Mapper
public interface OrderMapper {

	@ValueMappings({ //
			@ValueMapping(source = "EXTRA", target = "SPECIAL"), //
			@ValueMapping(source = "STANDARD", target = "DEFAULT"), //
			@ValueMapping(source = "NORMAL", target = "DEFAULT"), //
			@ValueMapping(source = "B2B", target = "DEFAULT") })
	ExternalOrderType orderTypeToExternalOrderType(OrderType orderType);

}