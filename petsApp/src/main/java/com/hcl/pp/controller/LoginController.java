package com.hcl.pp.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
@RequestMapping(value = "/main")
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/login1")
	public String beforeLogin(Model model) {
		model.addAttribute("user", new User());
		
		return "Login";
	}

	@PostMapping(value = "/login")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model,HttpServletRequest request, HttpServletResponse response) throws AppException {
		if (bindingResult.hasErrors()) {
			return "Login";
		} else {
			System.out.println(user.getUserName());
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			user = userService.findByUserName(user);
			if (user.getUserId()!= null) {
				model.addAttribute("user", user);
				
				return "Home";
			} else {
				String errorMessage= "Invalid UserName or Password";
				model.addAttribute("errorMessage", errorMessage);
				return "Login";
			}
		}
	}
}
