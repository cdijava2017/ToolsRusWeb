<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="entity.uc3_Donner1Avis.commentaire.*" %>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>Projet Tools'R'Us</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/style/bootstrap.min.css">
</head>
<body>

<% Commentaire commentaire = (Commentaire)request.getAttribute("Commentaire"); %>

<div class="container-fluid pt-5">
	<h2>***  confirmation de création du Commentaire  ***</h2>
</div>

<div class="h4 tm-3 lm-5">
	<div>.</div>
	<div>.</div>
	<div>.</div>
	<section style="text-align: center">
		<% if (commentaire.getIdComm() == -1) {%>
		<p> Attention, vous n'aviez pas saisi de numéro de bonbon </p>
		<p>Nous avons donc créé pour vous le commentaire N° : <%=commentaire.getIdComm()%></p>
		<% } else {%>
		<p>Vous venez de créer le commentaire N° : <%=commentaire.getIdComm()%></p>
		<% } %>
		<p>En plus, son petit texte est : <%=commentaire.getTexteComm() %></p>
		<p>Et son titre est : <%=commentaire.getTitre() %></p>
	</section>
</div>

<div>
	<form action="<%=request.getContextPath() %>/bonbon/formulaire" method="post">
		<div class="btn-group text-center mb-3">
			<input  class="btn btn-info" type="submit" value="Retour formulaire" />
		</div>
	</form>
</div>

</body>
</html>