package com.apex.bankApplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactInformation extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		/*
		 * String address = request.getParameter("address"); String city =
		 * request.getParameter("city"); String state = request.getParameter("state");
		 * String country = request.getParameter("country"); String phone =
		 * request.getParameter("phone"); request.getSession().setAttribute("oaddress",
		 * address); request.getSession().setAttribute("ocity", city);
		 * request.getSession().setAttribute("ostate", state);
		 * request.getSession().setAttribute("ocountry", country);
		 * request.getSession().setAttribute("ophone", phone);
		 */
		response.setContentType("text/html");
		response.sendRedirect("html/bankInfo.html");
	}

}
