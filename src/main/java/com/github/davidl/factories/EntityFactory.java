package com.github.davidl.factories;

import org.mapstruct.TargetType;

import com.github.davidl.entity.BaseEntity;

public class EntityFactory {

	public <T extends BaseEntity> T createEntity(@TargetType final Class<T> entityClass) {
		try {
			return entityClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
