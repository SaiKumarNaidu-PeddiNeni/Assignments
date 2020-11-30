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
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
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
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		
		
		
		
		int user_Id = Integer.parseInt(userId);
		HttpSession session = request.getSession();
		session.setAttribute("userId", user_Id);
		session.setAttribute("password", password);
		
		
		
		out.print("<a href='./Delete'>Delete your account</a>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
