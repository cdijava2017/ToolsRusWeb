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
	<br><br><br><br>
	<div id="list_de_trucs">
		<s:form namespace="" action="" method="post">
			<s:actionerror />
			<s:textfield type="text" 	name="titre.txtTitre" 			label="Saisir votre titre "  />
			<s:textfield type="number" 	name="commentaire.idComm" 		label="L'id du commentaire " />
			<s:textfield type="text" 	name="commentaire.texteComm" 	label="Votre commentaire "   />
	
	
	   		<s:submit class="btn btn-success" name="choix" value="creation" 	formaction="${creaComm}"  />
	   		<s:submit class="btn btn-success" name="choix" value="modification" formaction="${modifComm}" />    			
			<s:submit class="btn btn-success" name="choix" value="suppression" 	formaction="${supprComm}" />	        
		</s:form>
	</div>
	<br>
	<s:if test="message == 'créé'">
		<div class="alert alert-success">
			<p class="centre">Le commentaire est bien <s:property value="message"/> !</p>
		</div>
		<hr>
	</s:if>
	<s:elseif test="message == 'modifié'">
		<div class="alert alert-info">
			<p class="centre">Le commentaire est bien <s:property value="message"/> !</p>
		</div>
		<hr>
	</s:elseif>
	<s:elseif test="message == 'supprimé'">
		<div class="alert alert-danger">
			<p class="centre">Le commentaire est bien <s:property value="message"/> !</p>
		</div>
		<hr>
	</s:elseif>
		<s:elseif test="message != null">
		<div class="alert alert-danger">
			<p class="centre"><s:property value="message"/></p>
		</div>
		<hr>
	</s:elseif>

	<script src="<%=request.getContextPath()%>/script/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/script/jquery-3.2.1.min.js"></script>
</body>
</html>
