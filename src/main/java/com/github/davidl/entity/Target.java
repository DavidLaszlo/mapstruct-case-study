package com.github.davidl.entity;

import java.util.Date;
import java.util.List;

public class Target {

	private String stringProperty;
	private long longProperty;
	private String stringConstant;
	private Integer integerConstant;
	private Long longWrapperConstant;
	private Date dateConstant;
	private List<String> stringListConstants;

	public String getStringProperty() {
		return stringProperty;
	}

	public void setStringProperty(final String stringProperty) {
		this.stringProperty = stringProperty;
	}

	public long getLongProperty() {
		return longProperty;
	}

	public void setLongProperty(final long longProperty) {
		this.longProperty = longProperty;
	}

	public String getStringConstant() {
		return stringConstant;
	}

	public void setStringConstant(final String stringConstant) {
		this.stringConstant = stringConstant;
	}

	public Integer getIntegerConstant() {
		return integerConstant;
	}

	public void setIntegerConstant(final Integer integerConstant) {
		this.integerConstant = integerConstant;
	}

	public Long getLongWrapperConstant() {
		return longWrapperConstant;
	}

	public void setLongWrapperConstant(final Long longWrapperConstant) {
		this.longWrapperConstant = longWrapperConstant;
	}

	public Date getDateConstant() {
		return dateConstant;
	}

	public void setDateConstant(final Date dateConstant) {
		this.dateConstant = dateConstant;
	}

	public List<String> getStringListConstants() {
		return stringListConstants;
	}

	public void setStringListConstants(final List<String> stringListConstants) {
		this.stringListConstants = stringListConstants;
	}

}
