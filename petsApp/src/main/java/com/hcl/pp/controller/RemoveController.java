package com.hcl.pp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @SaiKumarNaidu (51897496)
 *
 * ${tags}
 */



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.pp.appexception.AppException;
import com.hcl.pp.model.User;
import com.hcl.pp.service.UserService;

@Controller
@RequestMapping(value = "/main")
public class RemoveController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/remove")
	public String remove(HttpServletRequest request, HttpServletResponse response) throws AppException {

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		userService.removee(user);
		return "Remove";
	}
}
