<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saisir</title>
</head>
<body>
<% String msg = (String)request.getAttribute("msg"); %>
 
<form action="Calcul" method="get">
1�re nombre :<input type="text" name ="op1"/><br>
2�me nombre :<input type="text" name ="op2"/><br>
Methode : <select name="op">
<option value="+">Addition</option>
<option value="-">Substraction</option>
<option value="/">Division</option>
<option value="*">factorisation</option>
</select>
<br>
<input type="submit" value="Calculer"/>
</form>
<%= msg = msg != null ? msg : "" %>
</body>
</html>