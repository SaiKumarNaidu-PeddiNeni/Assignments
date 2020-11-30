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

/**
 * Servlet implementation class Create
 */
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("Text/html"); // mime
		PrintWriter out = response.getWriter();
		out.print(" welcome to my home");
		
		//PrintWriter out = response.getWriter();
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		User user = new User();
		UserService userService = new UserServiceImp();
		user.setUserId(Integer.parseInt(userId));
		user.setPassword(password);
		
		 
		
		try {
			user = userService.validate(user);
			out.print(user.getUserName());
		} catch (AppException e) {
			e.printStackTrace();
		}	//out.print(user.getUserName());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
