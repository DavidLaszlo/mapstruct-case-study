package com.github.davidl.mappers.advanced;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.davidl.entity.Source;
import com.github.davidl.entity.Target;

@Mapper(uses = StringListMapper.class)
public interface SourceTargetMapper {

	@Mappings({ @Mapping(target = "stringProperty", source = "stringProp", defaultValue = "undefined"),
			@Mapping(target = "longProperty", source = "longProp", defaultValue = "-1"),
			@Mapping(target = "stringConstant", constant = "Constant Value"),
			@Mapping(target = "integerConstant", constant = "14"),
			@Mapping(target = "longWrapperConstant", constant = "3001"),
			@Mapping(target = "dateConstant", dateFormat = "dd-MM-yyyy", constant = "09-01-2014"),
			@Mapping(target = "stringListConstants", constant = "jack-jill-tom") })
	Target sourceToTarget(Source s);
}
