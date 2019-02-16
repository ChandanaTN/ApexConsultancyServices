package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome1Servlet
 */
@WebServlet("/ws1")
public class Welcome1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String middleName=request.getParameter("mname");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>My first servlet.</title></head>");
		out.println("<body>");
		out.println("<font color=red>First Name</font>"+firstName);
		out.println("<br/><font color=red>Last Name</font>"+lastName);
		out.println("<br/><font color=red>Middle Name</font>"+middleName);
		out.println("</body>");
		out.println("</html>");
	}

	

}
