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

	<h1 style="text-align:center;">Formulaire commentaire !</h1>
	
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>

	<s:url namespace="/uc3" action="CreerComm" 	var="creaComm" />
	<s:url namespace="/uc3" action="ModifComm"	var="modifComm" />
	<s:url namespace="/uc3" action="SupprComm" 	var="supprComm" />

	<br>

	
	<s:form namespace="" action="" method="post">
		<s:actionerror />
		<s:textfield name="commentaire.idComm" 		label="L'id du commentaire " />
		<s:textfield name="commentaire.texteComm" 	label="Votre commentaire " />
 		<div>
			<span>
				<s:submit class="btn btn-success" value="creation" formaction="${creaComm}" />
				<s:submit class="btn btn-success" value="modification" formaction="${modifComm}" />
				<s:submit class="btn btn-success" value="suppression" formaction="${supprComm}" />
			</span>
		</div>
	</s:form>


</body>
</html>