<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="fr">
<head>
	<meta charset="UTF-8">
	<title>ToolsRuS</title>
	<link rel="stylesheet" type="text/css "	href="<%=request.getContextPath()%>/style/Menu.css" />
	<link rel="stylesheet" type="text/css "	href="<%=request.getContextPath()%>/style/bootstrap.min.css" />
</head>
<body>

	<h1 style="text-align:center;">Liste des commentaires !</h1>
	
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
	
	<table id="tableCommentaire">
		<caption>Liste des commentaires enregistrés</caption>
		<tr>
			<th>Commentaire</th>
			<th>Like</th>
			<th>Dislike</th>
		</tr>
		<s:iterator value="listeCommentaires">
			<tr>
				<td value="commentaire.texteComm"></td>
				<td value="">valeur like</td>
				<td value="">valeur dislike</td>
			</tr>
		</s:iterator>
		<tr>
			<td>a</td>
			<td>b</td>
			<td>c</td>
		</tr>
		
	</table>
	
</body>
</html>