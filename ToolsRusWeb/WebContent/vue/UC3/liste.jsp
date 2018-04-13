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
 	
	<s:url namespace="/uc3" action="incremLikeCompteur"		var="incremLike" />
	<s:url namespace="/uc3" action="incremDislikeCompteur" 	var="incremDislike" />
	
	<table id="tableCommentaire">
		<caption>Liste des commentaires enregistrés</caption>
		<tr>
			<th>Titre</th>
			<th>Commentaire</th>
			<th>Nb Like</th>
			<th>id compt Like</th>
			<th>Nb Dislike</th>
			<th>id compt Dislike</th>
		</tr>
		<s:iterator value="listeCommentaires">
			<tr>
				<td><s:property value="titre.txtTitre" /></td>
				<td><s:property value="texteComm" /></td>
				<td><s:property value="getCptLike().compteur" /></td>
 				<td>
 					<s:property value="getCptLike().idCompteur" />
	 				<s:form namespace="" action="" method="post">
 						<s:submit name="getCptLike().idCompteur" 	value="+1" formaction="${incremLike}" />
 					</s:form>
 				</td>
				<td>
					<s:property value="getCptDislike().compteur"/>
				</td>
				<td>
					<s:property value="getCptDislike().idCompteur" />
	  				<s:form namespace="" action="" method="post">
 						<s:submit name="getCptDislike().idCompteur"	value="+1" formaction="${incremDislike}" />
 					</s:form>
 				</td>
			</tr>
		</s:iterator>
	</table>
	
	
</body>
</html>