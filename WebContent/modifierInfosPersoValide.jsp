<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site de ma banque - Modification effectu�e</title>
</head>
<body>
<h3 style="text-align:center">Modification effectu�e</h3>
	<p>
	Nom : ${sessionScope.nom }<br/>
	Pr�nom : ${sessionScope.prenom } <br/>
	Adresse : ${sessionScope.adresse } <br/>
	
	<a href="accueilClient.jsp">retour � l'accueil</a>
	</p>
	
</body>
</html>