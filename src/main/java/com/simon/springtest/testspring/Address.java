package com.simon.springtest.testspring;

public class Address {

	private String street;
	private String postCode;
	
	public Address() {}

	public Address(String street, String postCode) {
		super();
		this.street = street;
		this.postCode = postCode;
	}

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	@Override
	public String toString() {
		return "Address [street="+ street + ", postCode=" + postCode +"]";
	}

}
