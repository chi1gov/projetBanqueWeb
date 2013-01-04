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
	<form method="post" action="ModifierInfosPerso">
		Adresse : <input type='text' name="adresse" value="${sessionScope.adresse }" /><br/>
		<input type="submit" value="Valider"/>
	</form>
	
	<a href="accueilClient.jsp">retour à l'accueil</a></p>
</body>
</html>