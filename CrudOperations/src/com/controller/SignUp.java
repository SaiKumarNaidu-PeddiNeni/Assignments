package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UserService;
import com.service.UserServiceImp;

import appexception.AppException;
import model.User;

// SignUp/RegistrationPage 

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("Text/html"); // mime
		PrintWriter out = response.getWriter();
		out.print(" welcome to my home");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String userName = request.getParameter("userName");
		int user_Id = Integer.parseInt(userId);
		
		HttpSession session = request.getSession();
		session.setAttribute("newUserId", user_Id);
		session.setAttribute("newPassword", password);
		session.setAttribute("newUserName", userName);
		
		

		User user = new User();
		UserService userService = new UserServiceImp();
		user.setUserId(user_Id);
		user.setPassword(password);
		user.setUserName(userName);

		try {
			if (userService.create(user) != null) {
				out.print(" Successfully Register");
			} else {
				out.print(" Invalid Credentials");
			}

			// out.print(user.getUserName());
		} catch (AppException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
