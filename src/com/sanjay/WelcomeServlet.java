package com.sanjay;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = null;

		if ((username.equals("kiran")) && (password.equals("kiran"))) {
			message = "Welcome " + username + " thanks for login...";
		} else {
			message = "You are not the valid user...";
		}

		request.setAttribute("message", message);
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}
