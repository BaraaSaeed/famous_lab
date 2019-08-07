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
package co.grandcircus.CONSUME_API;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.CONSUME_API.model.CompleteItem;
import co.grandcircus.CONSUME_API.model.ItemResponse;
import co.grandcircus.CONSUME_API.model.TinyItem;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	public List<TinyItem> displayTinyItems() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		ItemResponse response = restTemplate.getForObject(url, ItemResponse.class);
//		System.out.println(response.getTiny());
		return response.getTiny();
	}

	public List<CompleteItem> displayCompleteItems() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		ItemResponse response = restTemplate.getForObject(url, ItemResponse.class);
		return response.getComplete();
	}
}
