package com.github.davidl.mappers.advanced;

import java.util.Arrays;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.davidl.entity.Source;
import com.github.davidl.entity.Target;

@Mapper
public interface SourceTargetMapperWithExpression2 {

	@Mappings({ @Mapping(target = "stringProperty", source = "stringProp", defaultValue = "undefined"),
			@Mapping(target = "longProperty", source = "longProp", defaultValue = "-1"),
			@Mapping(target = "stringConstant", constant = "Constant Value"),
			@Mapping(target = "integerConstant", constant = "14"),
			@Mapping(target = "longWrapperConstant", constant = "3001"),
			@Mapping(target = "dateConstant", dateFormat = "dd-MM-yyyy", constant = "09-01-2014"),
			@Mapping(target = "stringListConstants", expression = "java(convertStringToList(s.getStringProp()))") })
	Target sourceToTarget(Source s);

	default List<String> convertStringToList(final String stringProp) {
		return Arrays.asList(stringProp.split("-"));
	}
}
