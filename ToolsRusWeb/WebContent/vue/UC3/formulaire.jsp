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

	<s:url namespace="/uc3" action="creationFormComm" 		var="creaComm"  />
	<s:url namespace="/uc3" action="modificationFormComm"	var="modifComm" />
	<s:url namespace="/uc3" action="suppressionFormComm" 	var="supprComm" />

	<br>

	
	<s:form namespace="" action="" method="post">
		<s:actionerror />
		<s:textfield type="text" 	name="titre.txtTitre" 			label="Saisir votre titre "  />
		<s:textfield type="number" 	name="commentaire.idComm" 		label="L'id du commentaire " />
		<s:textfield type="text" 	name="commentaire.texteComm" 	label="Votre commentaire "   />
		
   		<s:submit class="btn btn-success" name="choix" value="creation" 	formaction="${creaComm}"  />
   		<s:submit class="btn btn-success" name="choix" value="modification" formaction="${modifComm}" />    			
		<s:submit class="btn btn-success" name="choix" value="suppression" 	formaction="${supprComm}" />	        
	</s:form>


</body>
</html>
