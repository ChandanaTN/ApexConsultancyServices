package com.apex.weatherApplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WeatherForecast extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		  String city = request.getParameter("city"); 
		  String zipCode =request.getParameter("zipCode"); 
		  if(city.equalsIgnoreCase("Sunnyvale")||(zipCode.equals("94086")))
		  {
			  request.getSession().setAttribute("temperature", "57F");
			  request.getSession().setAttribute("humidity", "73%");
			  request.getSession().setAttribute("wind", "Rain");
		  }
		  else if(city.equalsIgnoreCase("Fremont")||(zipCode.equals("94538")))
		  {
			  request.getSession().setAttribute("temperature", "55F");
			  request.getSession().setAttribute("humidity", "77%");
			  request.getSession().setAttribute("wind", "Rain");
		  }
		  else if(city.equalsIgnoreCase("San Francisco")||(zipCode.equals("94103")))
		  {
			  request.getSession().setAttribute("temperature", "53F");
			  request.getSession().setAttribute("humidity", "86%");
			  request.getSession().setAttribute("wind", "Rain");
		  }
		  else
		  {
			  request.getSession().setAttribute("temperature", "90F");
			  request.getSession().setAttribute("humidity", "13%");
			  request.getSession().setAttribute("wind", "Sunny");
		  }
		response.setContentType("text/html");
		response.sendRedirect("jsp/weatherInfo.jsp");
	}
}
