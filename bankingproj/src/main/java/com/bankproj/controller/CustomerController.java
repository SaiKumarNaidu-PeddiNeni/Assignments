/**
 * 
 */
package com.bankproj.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bankproj.model.Customer;
import com.bankproj.service.CustomerService;


/**
 * @Sai Kumar Naidu (51897496)
 *
 */
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService; 
	
	
	@GetMapping(value = "addcustomer")
	public String entrollAdmin(Model model) {

		model.addAttribute("customer", new Customer());
		return "register";
	}
	@PostMapping(value="savecustomer")
	public String afterEnrollPatient(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		System.out.println("in customer controller");
		customerService.register(customer);
	     
		model.addAttribute("customer", customer);
			
			return "success";
	}
}
