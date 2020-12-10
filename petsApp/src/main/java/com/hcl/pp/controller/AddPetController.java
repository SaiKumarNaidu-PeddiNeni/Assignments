/**
 * 
 */
package com.hcl.pp.controller;

//import java.util.ArrayList;
//import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
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
import com.hcl.pp.model.Pet;
//import com.hcl.pp.model.User;
import com.hcl.pp.service.PetService;

/**
 * @SaiKumarNaidu (51897496)
 *
 */

@Controller
@RequestMapping(value = "/main")
public class AddPetController {

	@Autowired
	private PetService petService;

	@GetMapping(value = "/AddPet1")
	public String beforeAddPet(Model model) {
		model.addAttribute("pet", new Pet());

		return "AddPet";
	}

	@PostMapping(value = "/addPet")
	public String addPet(@Valid @ModelAttribute("pet") Pet pet, BindingResult bindingResult, Model model,
			HttpServletRequest request, HttpServletResponse response) throws AppException {
	
		/*List<Pet> newPet = new ArrayList<Pet>();
		newPet.add(pet);
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		user.setPets(newPet);*/
		petService.addPet(pet);
		return "failure";
	}
	
	
}
