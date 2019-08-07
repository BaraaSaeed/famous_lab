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

public class TinyItem implements Comparable<TinyItem> {

	private String name;
	private String invented;
	private String year;

	public TinyItem() {
		super();
	}

	public TinyItem(String name, String invented, String year) {
		super();
		this.name = name;
		this.invented = invented;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvented() {
		return invented;
	}

	public void setInvented(String invented) {
		this.invented = invented;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Tiny [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}

	@Override
	public int compareTo(TinyItem T) {
		return this.getYear().compareTo(T.getYear());
	}

}
