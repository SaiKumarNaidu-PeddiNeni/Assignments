/**
 * 
 */
package com.hcl.pp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.User;
import com.hcl.pp.service.UserService;

/**
 * @SaiKumarNaidu (51897496)
 *
 */
@Controller
public class ListUserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/GetAllUsers")
	public String getAllPets(HttpServletRequest request, HttpServletResponse response,Model model) throws AppException
	{
		List<User> usersList = new ArrayList<User>();
		System.out.println("In all pets controller");
		usersList = userService.getAllUsers();
		model.addAttribute("UsersList", usersList);
		return "UsersList";
	}

}
