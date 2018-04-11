<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>ToolsRuS</title>

<link rel="stylesheet" type="text/css "
	href="<%=request.getContextPath()%>/style/Menu.css" />
<link rel="stylesheet" type="text/css "
	href="<%=request.getContextPath()%>/style/bootstrap.min.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>


	<h1>Formulaire d'inscription</h1>
	<br>
	<s:form namespace="/gestionAcces" action="creerProfil" method="post"
		validate="false">

		<s:textfield name="nom" label="nom" />
		<s:textfield name="prenom" label="prenom " />
		<s:textfield name="email" label="email" />

		<s:textfield name="pseudo" label="pseudo" />
		<s:textfield name="pw" label="mot de passe" />

		<s:submit value="valider">
		</s:submit>
	</s:form>

<br>
	<s:a namespace="/gestionAcces" action="accueilGestion">Accueil</s:a>
	<script src="<%=request.getContextPath()%>/script/gestionAcces/scriptMenu.js"></script>
</body>
</html>