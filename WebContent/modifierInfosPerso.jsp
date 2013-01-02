<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site de ma banque - Modifications informations personnelles</title>
</head>
<body>
	<h3 style="text-align:center">Modification de vos informations personnelles</h3>
	<p>Prénom : ${sessionScope.prenom } <br/>
	Nom : ${sessionScope.nom }<br/>
	Adresse : <input type='text' value="${requestScope.adresse }"/><br/>
	<a href="accueilClient.jsp">retour à l'accueil</a></p>
</body>
</html>