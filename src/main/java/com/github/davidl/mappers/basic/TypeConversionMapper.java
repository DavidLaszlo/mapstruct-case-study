package com.github.davidl.mappers.basic;

import org.mapstruct.Mapper;

import com.github.davidl.dto.TypeConversionExampleDTO;
import com.github.davidl.entity.TypeConversionExampleEntity;

@Mapper
public interface TypeConversionMapper {

	public TypeConversionExampleDTO dtoToEntity(TypeConversionExampleEntity entity);

}
