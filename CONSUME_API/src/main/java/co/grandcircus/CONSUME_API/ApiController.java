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

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CONSUME_API.model.CompleteItem;
import co.grandcircus.CONSUME_API.model.TinyItem;

@Controller
public class ApiController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView showTinyItems() {
		System.out.println(apiService.displayTinyItems());
		List<TinyItem> myList = apiService.displayTinyItems();
		Collections.sort(myList);
		return new ModelAndView("index", "tiny", myList);
	}

	@RequestMapping("/complete")
	public ModelAndView showCompleteItems() {
		List<CompleteItem> myList = apiService.displayCompleteItems();
		Collections.sort(myList);
		return new ModelAndView("show-complete", "complete", myList);
	}
}
