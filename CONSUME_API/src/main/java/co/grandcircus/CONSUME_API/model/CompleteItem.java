/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/
/**
 * 
 */
package co.grandcircus.CONSUME_API.model;

public class CompleteItem implements Comparable<CompleteItem> {

	private String firstName;
	private String lastName;
	private String innovation;
	private String year;

	public CompleteItem() {
		super();
	}

	public CompleteItem(String firstName, String lastName, String innovation, String year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.innovation = innovation;
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CompleteItem [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation
				+ ", year=" + year + "]";
	}

	@Override
	public int compareTo(CompleteItem C) {
		return this.getYear().compareTo(C.getYear());
	}

}
