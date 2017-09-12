package com.github.davidl.mappers.collections.map;

import java.util.Date;
import java.util.Map;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;

@Mapper
public interface SourceTargetMapper {

	@MapMapping(valueDateFormat = "dd.MM.yyyy")
	Map<String, String> longDateMapToStringStringMap(Map<Long, Date> source);

	@MapMapping(valueDateFormat = "dd.MM.yyyy")
	Map<Long, Date> stringStringMapToLongDateMap(Map<String, String> source);
}