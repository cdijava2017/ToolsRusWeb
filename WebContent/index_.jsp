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

	<h1>Accueil Principal</h1>

	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>

<s:a namespace="/gestionAcces" action ="accueilGestion">Connexion</s:a>
</body>
</html>