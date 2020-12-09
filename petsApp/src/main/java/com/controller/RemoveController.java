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
public class RemoveController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/Remove1")
	public String beforeLogin(Model model) {
		model.addAttribute("user", new User());

		return "RemoveConformation";
	}

	@PostMapping(value = "/remove")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "RemoveConformation";
		} else {
			System.out.println(user.getUserName());
			user = userService.removee(user);
			if (user.getUserName() == null)
				return "failure";
			else
				return "RemoveConformation";
		}
	}

}
