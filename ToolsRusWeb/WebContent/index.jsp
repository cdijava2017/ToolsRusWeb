<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="fr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"  type ="text/css " href="<%=request.getContextPath()%>/style/Menu.css"/>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
		test affichage accueil index de base
	<s:a namespace="/uc4" action="accueilUc4">lien vers ma page</s:a>
</body>
</html>