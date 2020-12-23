/**
 * 
 */
package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */


@RestController
public class FirstController {
	
	@RequestMapping(value="/")
	public String message()
	{
		return "Hello RESTful web services";
	}

}
