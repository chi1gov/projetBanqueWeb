<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
 <h3 style="text-align:center">Ma Banque</h3>
 <form method="post" action="Connexion">
 	<p> Nom : <input type="text" name="nom"/> </p>
 	<p> Prenom : <input type="text" name="prenom"/> </p>
	<input type="submit" value="Connection" />
 </form>
 
<c:choose>
	<c:when test="${not empty sessionScope.error }">
	<p style="color:red">${sessionScope.error }</p>
	</c:when>
	<c:otherwise>
	<p style="color:red"></p>
	</c:otherwise>
</c:choose>
</body>
</html>