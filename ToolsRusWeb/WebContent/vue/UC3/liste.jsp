<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="fr">
<head>
	<meta charset="UTF-8">
	<title>ToolsRuS</title>
	<link rel="stylesheet" type="text/css " href="<%=request.getContextPath()%>/style/Menu.css" />
	<link rel="stylesheet" type="text/css "	href="<%=request.getContextPath()%>/style/bootstrap.min.css" />
</head>
<body>

	<h1 style="text-align: center;">Liste des commentaires !</h1>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>

	<br><br><br><br><hr>
	
	<s:url namespace="/uc3" action="incremLikeCompteur" var="incremLike">
		<s:param name="id">	<s:property value="getCptLike().idCompteur" /> </s:param>
	</s:url>
	<s:url namespace="/uc3" action="incremDislikeCompteur" var="incremDislike">
		<s:param name="id">	<s:property value="getCptDislike().idCompteur" /> </s:param>
	</s:url>
	<s:url namespace="/uc3" action="supprimerComm" var="supprimerComm">
		<s:param name="id">	<s:property value="commentaire.idComm" /> </s:param>
	</s:url>
	<s:url namespace="/uc3" action="modifier" var="modifierComm">
		<s:param name="id">	<s:property value="commentaire.idComm" /> </s:param>
	</s:url>

	<div id="list_de_trucs" class="table-responsive" >
		<table id="tableCommentaire">
			<caption class="centre">Liste des commentaires enregistrés</caption>
			<tr class="text-center" bgcolor="#82C46C" >
				<th width="200px">Titre</th>
				<th width="300px">Commentaire</th>
				<th>Liker</th>
				<th width="50px"></th>
				<th>Disliker</th>
				<th width="50"></th>
				<th></th>
				<th></th>
			</tr>
			<s:if test="listeCommentaires.isEmpty()">
				<p class="centre">Aucun commentaire à afficher, veuillez d'abord en créer.</p>
			</s:if>
			<s:else>
				<s:iterator value="listeCommentaires">
					<tr class="text-center" bgcolor="#E6E6E6">
						<td><s:property value="titre.txtTitre" /></td>
						<td><s:property value="texteComm" /></td>
						<td><s:property value="getCptLike().compteur" /></td>
						<td><s:a action="%{incremLike}"><s:param name="id">		<s:property value="getCptLike().idCompteur" /> 		</s:param> +1 </s:a></td>
						<td><s:property value="getCptDislike().compteur" /></td>
						<td><s:a action="%{incremDislike}"><s:param name="id">	<s:property value="getCptDislike().idCompteur" />	</s:param> +1 </s:a></td>
						<td><s:a action="%{supprimerComm}"><s:param name="id">	<s:property value="idComm" />						</s:param> &nbsp;supprimer </s:a></td>
						<td><s:a action="%{modifierComm}"><s:param name="id">	<s:property value="idComm" />						</s:param> modifier&nbsp; </s:a></td>
					</tr>
				</s:iterator>
			</s:else>
		</table>
	</div>
	<s:if test="message == 'supprimé'">
		<div class="alert alert-danger">
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
	
	
	<script src="<%=request.getContextPath()%>/script/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/script/jquery-3.2.1.min.js"></script>
</body>
</html>