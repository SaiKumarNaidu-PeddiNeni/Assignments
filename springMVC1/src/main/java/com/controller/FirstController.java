package com.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping(value = "/main")
public class FirstController {

	@Autowired
	private UserService userService;
	/*
	 * @PostMapping(value = "/one") public String happy(@RequestParam("userId") int
	 * userId, @RequestParam("password") String password, Model model) {
	 * model.addAttribute("userId", userId); model.addAttribute("password",
	 * password); System.out.println(userId); System.out.println(password); return
	 * "Hello"; }
	 */

	/*
	 * @PostMapping(value = "/one") public ModelAndView
	 * Happy(@RequestParam("userId") int userId, @RequestParam("password") String
	 * password,
	 * 
	 * @RequestParam("userName") String userName) { ModelAndView modelAndView = new
	 * ModelAndView("Hello");
	 * 
	 * User user = new User(); user.setUserId(userId); user.setPassword(password);
	 * user.setUserName(userName);
	 * 
	 * 
	 * modelAndView.addObject("userId", userId);
	 * modelAndView.addObject("password",password);
	 * modelAndView.addObject("userName", userName);
	 * 
	 * 
	 * modelAndView.addObject("user", user);
	 * 
	 * return modelAndView;
	 * 
	 * }
	 * 
	 * @GetMapping(value = { "/one", "/two/{data}" }) public String
	 * hello(@PathVariable("data") int userId, Model model) {
	 * model.addAttribute("userId", userId); return "Hello"; }
	 */

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
			user = userService.read(user);
			if (user.getUserName() != null) {
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
