package com.main;

import java.util.Scanner;

import com.service.UserService;
import com.service.UserServiceImp;

import appexception.AppException;
import model.User;

public class AppMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" enter purpose  i.e., Create, Update, Read and Delete");
		String Choice = scan.nextLine();

		if (Choice.equalsIgnoreCase("create")) {
			System.out.println("Enter user id :");
			int userid = scan.nextInt();
			System.out.println("Enter user password : ");
			String pswd = scan.next();
			System.out.println("Enter user User_name : ");
			String User_name = scan.next();
			UserService service = new UserServiceImp();
			try {

				User objService = service.createUser(userid, pswd,User_name);
				System.out.println("Welcome : " + objService.getUserName());
			} catch (AppException e) {
				System.err.println(e.getMessage());
			}

		}
		else if (Choice.equalsIgnoreCase("read")) {
			System.out.println("Enter user id :");
			int userid = scan.nextInt();
			System.out.println("Enter user password : ");
			String pswd = scan.next();

			UserService service = new UserServiceImp();
			try {

				User objService = service.readUserByIdAndPassword(userid, pswd);
				System.out.println("Welcome : " + objService.getUserName());
			} catch (AppException e) {
				System.err.println(e.getMessage());
			}
			service = null;
			scan.close();
		}
		else if(Choice.equalsIgnoreCase("delete"))
		{
			System.out.println("Enter user id :");
			int userid = scan.nextInt();
			UserService service = new UserServiceImp();
			System.out.println("sucessfully deleted"+ service.deleteUserById(userid));
		}
	}

}
