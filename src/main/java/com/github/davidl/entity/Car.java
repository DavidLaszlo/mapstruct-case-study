package com.github.davidl.entity;

public class Car {

	private String make;
	private Integer numberOfSeats;
	private int productionYear;
	private Integer previousOwners;

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

	public Integer getPreviousOwners() {
		return previousOwners;
	}

	public void setPreviousOwners(final Integer previousOwners) {
		this.previousOwners = previousOwners;
	}

}
