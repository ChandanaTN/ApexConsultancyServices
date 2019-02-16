package com.apex.bankApplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankApplication extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		/*
		 * String bankName = request.getParameter("bankName"); String accountNumber =
		 * request.getParameter("accNum"); String ssn = request.getParameter("ssn");
		 * request.getSession().setAttribute("obankName", bankName);
		 * request.getSession().setAttribute("oaccountNumber", accountNumber);
		 * request.getSession().setAttribute("ossn", ssn);
		 */
		response.setContentType("text/html");
		response.sendRedirect("html/success.html");
	}
}
