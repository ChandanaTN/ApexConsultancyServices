package com.apex.bankApplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalInformation extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		/*
		 * String fname = request.getParameter("fname"); String lname =
		 * request.getParameter("lname"); String mname = request.getParameter("mname");
		 * String gender = request.getParameter("gender");
		 * request.getSession().setAttribute("ofname", fname);
		 * request.getSession().setAttribute("olname", lname);
		 * request.getSession().setAttribute("omname", mname);
		 * request.getSession().setAttribute("ogender", gender);
		 */
		response.setContentType("text/html");
		response.sendRedirect("html/contactInfo.html");
	}
}
