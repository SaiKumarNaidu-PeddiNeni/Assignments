package com.controller;


/**
 * @SaiKumarNaidu (51897496)
 *
 * ${tags}
 */

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping(value = "/main")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/login1")
	public String beforeLogin(Model model) {
		model.addAttribute("user", new User());
		
		return "Login";
	}

	@PostMapping(value = "/login")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "Login";
		} else {
			System.out.println(user.getUserName());
			user = userService.read(user);
			if (user.getUserId()!= null) {
				model.addAttribute("user", user);
				
				return "Hello";
			} else {
				String errorMessage= "Invalid UserName or Password";
				model.addAttribute("errorMessage", errorMessage);
				return "Login";
			}
		}
	}
	
	@RequestMapping(value="/add")
	public String Add()
	{
		return "AddPet";
	}

}
