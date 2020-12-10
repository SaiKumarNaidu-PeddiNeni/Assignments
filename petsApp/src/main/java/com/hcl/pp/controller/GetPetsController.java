/**
 * 
 */
package com.hcl.pp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.service.PetService;
import com.hcl.pp.service.UserService;

/**
 * @SaiKumarNaidu (51897496)
 *
 */

@Controller
@RequestMapping(value = "/main")
public class GetPetsController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PetService petService;

	@RequestMapping(value = "/GetMyPets")
	public String getMyPets(HttpServletRequest request, HttpServletResponse response) throws AppException {

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
	
		List<Pet> pets = new ArrayList<Pet>();
		pets = userService.getMyPets(user);
		return "failure";
	}
	@RequestMapping(value = "/GetAllPets")
	public String getAllPets(HttpServletRequest request, HttpServletResponse response,Model model) throws AppException
	{
		List<Pet> pets = new ArrayList<Pet>();
		System.out.println("In all pets controller");
		pets = petService.getAllPets();
		model.addAttribute("Pets", pets);
		model.addAttribute("AllPets", pets);
		return "AllPets";
	}
}
