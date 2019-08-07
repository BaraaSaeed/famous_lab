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

import java.util.List;

public class ItemResponse {

	private List<CompleteItem> complete;
	private List<TinyItem> tiny;

	public ItemResponse() {
		super();
	}

	public ItemResponse(List<CompleteItem> complete, List<TinyItem> tiny) {
		super();
		this.complete = complete;
		this.tiny = tiny;
	}

	public List<CompleteItem> getComplete() {
		return complete;
	}

	public void setComplete(List<CompleteItem> complete) {
		this.complete = complete;
	}

	public List<TinyItem> getTiny() {
		return tiny;
	}

	public void setTiny(List<TinyItem> tiny) {
		this.tiny = tiny;
	}

	@Override
	public String toString() {
		return "ItemResponse [complete=" + complete + ", tiny=" + tiny + "]";
	}

}
