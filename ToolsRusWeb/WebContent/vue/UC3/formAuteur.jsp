<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>exo2Biblio</title>
<link href="<%=request.getContextPath()%>/css/biblio.css"
	rel="stylesheet" type="text/css" />
</head>
<body>



	<s:url namespace="/vue" action="CreerAuteur" var="creaLivre" />
	<s:url namespace="/vue" action="ModifAuteur"	var="modifLivre" />
	<s:url namespace="/vue" action="SupprAuteur" var="supLivre" />


	<br></br>
	<br></br>
	<h1>Accueil Autheur</h1>
	<br></br> Voici l'auteur créé en base :
	<s:property value="auteur" />

	<s:form namespace="/vue" action="RecupAuteur" method="post">
		<s:actionerror />
		<s:textfield name="auteur.id" label="Votre id " />
		<s:textfield name="auteur.nom" label="Votre nom " cssClass="test" />
		<s:textfield name="auteur.prenom" label="Votre prénom " cssClass="test" />
		<s:textfield name="auteur.nationalite" label="Votre nationalité " cssClass="test" />


		<s:submit name="choix" value="creation" formaction="${creaLivre}" />
		<s:submit name="choix" value="modification" formaction="${modifLivre}" />
		<s:submit name="choix" value="suppression" formaction="${supLivre}" />
	</s:form>


</body>
</html>