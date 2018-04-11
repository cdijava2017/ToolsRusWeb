<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="fr">
<head>
<link rel="stylesheet" type="text/css "
	href="<%=request.getContextPath()%>/style/Menu.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil ToolsRuS</title>
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


	<!--<s:a namespace="/gestionAcces" action="accueilGestion">Connexion</s:a>-->
</body>
</html>