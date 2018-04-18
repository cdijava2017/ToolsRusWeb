<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="fr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"  type ="text/css " href="<%=request.getContextPath()%>/style/Menu.css"/>
<title>Accueil</title>
</head>
<body>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
		test affichage accueil index de base
	<s:a namespace="/uc4" action="accueilUc4">lien vers ma page</s:a>
	<script src="<%=request.getContextPath()%>/script/scriptMenu.js" charset="UTF-8"></script>
</body>
</html>