package com.github.davidl.dto;

import java.util.List;

public class CarDto {

	private String manufacturer;
	private Integer seatCount;
	private int productionYear;
	private int previousOwnerCount;
	private List<String> previousOwners;
	private List<CarDto> ownersPreviousCars;
	private String name;
	private PersonDTO driver;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(final String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(final Integer seatCount) {
		this.seatCount = seatCount;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(final int productionYear) {
		this.productionYear = productionYear;
	}

	public int getPreviousOwnerCount() {
		return previousOwnerCount;
	}

	public void setPreviousOwnerCount(final int previousOwnerCount) {
		this.previousOwnerCount = previousOwnerCount;
	}

	public List<String> getPreviousOwners() {
		return previousOwners;
	}

	public void setPreviousOwners(final List<String> previousOwners) {
		this.previousOwners = previousOwners;
	}

	public List<CarDto> getOwnersPreviousCars() {
		return ownersPreviousCars;
	}

	public void setOwnersPreviousCars(final List<CarDto> ownersPreviousCars) {
		this.ownersPreviousCars = ownersPreviousCars;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public PersonDTO getDriver() {
		return driver;
	}

	public void setDriver(final PersonDTO driver) {
		this.driver = driver;
	}

}
