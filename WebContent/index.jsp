<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil du site</title>
</head>
<body>
<!-- Action : identification (utilisateur donne son nom et son prenom -->
 <!-- vue : index.jsp -->
 <!-- nom : ______ prenom : ________  |CONNECTION| -->
 <!-- controleur connexion.java (servlet) -->
 <!--  doPost(...) -->
 
 <form method="post" action="connecion">
 	<p> Nom : <input type="text" name="nom"/> </p>
 	<p> Prenom : <input type="text" name="nom"/> </p>
	<input type="submit" value="Connection" />
 </form>
</body>
</html>