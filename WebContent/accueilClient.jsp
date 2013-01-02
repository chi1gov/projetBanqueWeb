<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil Client</title>
</head>
<body>
	<h3 style="text-align:center">Bienvenue</h3>
	<p>Bonjour ${sessionScope.prenom } ${sessionScope.nom }, que souhaitez-vous faire ?</p>
	<div id=menu>
		<a href="">Modifiez vos informations personnelles.</a><br/>
		<a href="">Gérez vos comptes.</a><br/>
		<a href="">Se déconnecter.</a>
	</div>
</body>
</html>