package com.github.davidl.mappers.basic.enums;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;

import com.github.davidl.enums.ExternalOrderType;
import com.github.davidl.enums.OrderType;

@Mapper
public interface SpecialOrderMapper2 {

	@ValueMappings({ //
			@ValueMapping(source = MappingConstants.NULL, target = "DEFAULT"), //
			@ValueMapping(source = "STANDARD", target = MappingConstants.NULL), //
			@ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "SPECIAL") })
	ExternalOrderType orderTypeToExternalOrderType2(OrderType orderType);
}
