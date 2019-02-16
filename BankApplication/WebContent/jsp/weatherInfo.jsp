<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    // This is a scriptlet.  Notice that the "date"
    // variable we declare here is available in the
    // embedded expression later on.
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
    
    
%>
<font color="blue"> Todays Date: </font><%= date %></font>

<center><h1> <font color="black"> WEATHER INFORMATION </font> </h1></center>
<br>
<br>
<br>
<%
String varTemperature = (String) request.getSession().getAttribute("temperature");
String varHumidity = (String) request.getSession().getAttribute("humidity");
String varWind = (String) request.getSession().getAttribute("wind");
%>
<%if (varTemperature != null){%>
	TEMPERATURE = <%=varTemperature%>
	<br>
<%}%>
<%if (varHumidity != null){%>
	HUMIDITY = <%=varHumidity%>
	<br>
<%}%>
<%if (varWind != null){%>
	RAINY/SUNNY = <%=varWind%>
	<br>
<%}%>
<br>
</body>
</html>