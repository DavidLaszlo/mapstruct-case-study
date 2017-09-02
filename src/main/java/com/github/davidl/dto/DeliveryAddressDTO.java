package com.github.davidl.dto;

public class DeliveryAddressDTO {

	private String name;
	private String carName;
	private String concatenatedAddress;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(final String carName) {
		this.carName = carName;
	}

	public String getConcatenatedAddress() {
		return concatenatedAddress;
	}

	public void setConcatenatedAddress(final String concatenatedAddress) {
		this.concatenatedAddress = concatenatedAddress;
	}

}
