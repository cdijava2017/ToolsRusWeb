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

	<h1 class="text-center">Formulaire commentaire !</h1>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>

 	<s:if test="hasActionErrors()">
		<s:actionerror id="actionerror" label="actionerror : " />
		<hr />
	</s:if>				

	<s:url namespace="/uc3" action="creationComm" 		var="creaComm"  />

	<br><br><br><br><br>
	
	<div id="list_de_trucs" class="text-center">
		<s:form namespace="" action="" method="post">
 			<s:actionerror />
			<s:textfield type="text" 	name="titre.txtTitre" 			label="Saisir votre titre "  size="50"/>
			<s:textfield type="number" 	name="commentaire.idComm" 		label="L'id du commentaire " size="20"/>
			<s:textfield type="text" 	name="commentaire.texteComm" 	label="Votre commentaire "   size="50"/>
			<br><br><br><hr>
	
	   		<div id="submitForm"><s:submit id="submitForm" class="btn btn-success" value="creation" formaction="${creaComm}"  /></div>
		</s:form>
		<br><hr>
	</div>
	<br>
	
	<s:if test="message == 'créé'">
		<div class="alert alert-success">
			<p class="centre">Le commentaire est bien <s:property value="message"/> !</p>
		</div>
		<hr>
	</s:if>
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
