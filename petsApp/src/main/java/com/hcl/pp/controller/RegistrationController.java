package com.hcl.pp.controller;

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

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.User;
import com.hcl.pp.service.UserService;

@Controller
@RequestMapping(value="/main")
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(value = "/Register1")
	public String beforeLogin(Model model) {
		model.addAttribute("user", new User());
		return "Register";
	}

	@PostMapping(value = "/register")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) throws AppException {
		if (bindingResult.hasErrors()) {
			return "Register";
		} else {
			System.out.println(user.getUserName());
			
			user = userService.addUser(user);
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

}
