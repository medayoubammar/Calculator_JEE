<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affichage</title>
</head>
<body>

<% String op1 = request.getParameter("op1");
String op2 = request.getParameter("op2");
String op = request.getParameter("op");
 float z = (float)request.getAttribute("res");
%>

<%= op1 +" "+op+" "+op2+" = "+ z %>

</body>
</html>