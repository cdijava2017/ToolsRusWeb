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

	<h1 class="centre">Supprimer un commentaire !</h1>

	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>

	<s:url namespace="/uc3" action="suppressionFormComm" var="supprComm" />


	<!-- 

<h2>
	<s:select label="Select a month" 
		headerKey="-1" headerValue="Select Month"
		list="#{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr'}" 
		name="yourMonth" 
		value="2" />
</h2> 
-->
<s:form action="suppressionFormComm" namespace="/uc3">
	<s:select label="Selectionnez un commentaire" headerKey="-1"
		headerValue="Selectionnez un commentaire" list="listeCommentaires"
		name="commentaire" />
<!-- 
	<s:submit class="btn btn-success" name="commentaire" value="suppression"
		formaction="${supprComm}" />	-->
		
	<s:submit value="suppression" name="commentaire" />
</s:form>

</body>
</html>
