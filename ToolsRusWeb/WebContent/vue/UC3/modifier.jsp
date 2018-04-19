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

	<h1 style="text-align:center;">Modification du commentaire !</h1>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>

	<s:if test="hasFieldErrors()">
		<ul>
			<s:fielderror>Les erreurs suivantes se sont produites : </s:fielderror>
		</ul>
		<hr />
	</s:if>
	<s:if test="hasActionErrors()">
		<s:actionerror id="actionerror" label="actionerror : " />
		<hr />
	</s:if>
	<s:if test="hasActionMessages()">
		<s:actionmessage id="actionmessage" label="actionmessage :" />
		<hr />
	</s:if>
	
	<s:url namespace="/uc3" action="modificationFormComm"	var="modifComm" >
		<s:param name="id"> <s:property value="commentaire.idComm" /> </s:param>
	</s:url>
	<br><br><br><br><br>
	
	<div id="list_de_trucs" class="text-center">
		<s:form namespace="" action="" method="post">
			<s:actionerror />
			<s:textfield type="text" 	name="commentaire.titre.txtTitre" 	label="Saisir votre titre "  size="50"/>
	 		<s:textfield type="number" 	name="commentaire.idComm" 			label="L'id du commentaire " size="10" readonly="true" />		
			<s:textfield type="text" 	name="commentaire.texteComm" 		label="Votre commentaire "   size="50"/>
			<br><br><br><hr>
	
	   		<div id="submitForm"><s:submit class="btn btn-success" id="submitForm" name="choix" value="modification" formaction="${modifComm}" /></div> 	
		</s:form>
		<br><hr>
	</div>
	<br>
	<s:if test="message == 'modifié'">
		<div class="alert alert-info">
			<p class="centre">Le commentaire est bien <s:property value="message"/> !</p>
		</div>
		<hr>
	</s:if>


	<script src="<%=request.getContextPath()%>/script/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/script/jquery-3.2.1.min.js"></script>
</body>
</html>
