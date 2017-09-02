package com.github.davidl.dto;

public class CarDto {

	private String manufacturer;
	private Integer seatCount;
	private int productionYear;
	private int previousOwners;

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

	public int getPreviousOwners() {
		return previousOwners;
	}

	public void setPreviousOwners(final int previousOwners) {
		this.previousOwners = previousOwners;
	}

}
