package com.github.davidl.entity;

import java.util.List;

public class Car {

	private String make;
	private Integer numberOfSeats;
	private int productionYear;
	private Integer previousOwnerCount;
	private List<String> previousOwners;
	private List<Car> ownersPreviousCars;
	private String name;
	private Person driver;

	public String getMake() {
		return make;
	}

	public void setMake(final String make) {
		this.make = make;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(final Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(final int productionYear) {
		this.productionYear = productionYear;
	}

	public Integer getPreviousOwnerCount() {
		return previousOwnerCount;
	}

	public void setPreviousOwnerCount(final Integer previousOwnerCount) {
		this.previousOwnerCount = previousOwnerCount;
	}

	public List<String> getPreviousOwners() {
		return previousOwners;
	}

	public void setPreviousOwners(final List<String> previousOwners) {
		this.previousOwners = previousOwners;
	}

	public List<Car> getOwnersPreviousCars() {
		return ownersPreviousCars;
	}

	public void setOwnersPreviousCars(final List<Car> ownersPreviousCars) {
		this.ownersPreviousCars = ownersPreviousCars;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Person getDriver() {
		return driver;
	}

	public void setDriver(final Person driver) {
		this.driver = driver;
	}

}
