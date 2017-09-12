package com.github.davidl.mappers.advanced;

import java.util.Arrays;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface StringListMapper {

	public default List<String> mapStringToList(final String string) {
		return Arrays.asList(string.split("-"));
	}

}
