<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="entity.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Liste des localisations</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link 	rel="stylesheet" href="<%=request.getContextPath() %>/visuel/bootstrap.min.css">
	<link href="<%= request.getContextPath() %>/visuel/MenuDeroulant.css" rel="stylesheet">
</head>
<body>

	
<div class="container-fluid pt-5">
	<h2>***  liste des commentaires  ***</h2>
</div>

<!-- Bloc de gestion des messages de redirection -->
<div>

</div>

<div class="w-50 pl-5 pr-5 mb-5">
<section>
	<table>
		<tr>
			<th>Reference</th>
			<th>Nom</th>
			<th>Couleur</th>
		</tr>

	</table>	
</section>
	<form>
		<button class="btn btn-info" id="sup" 
				formAction="<%=request.getContextPath() %>/bonbon/suppressionAll" method="post">Tout supprimer</button>
		<button class="btn btn-info" id="toutLister" 
				formAction="<%=request.getContextPath() %>/bonbon/liste" method="post">Tout lister</button>
	</form>	
</div>
	
<!-- 	
<div class="form-group row">
	<span class="col-2"></span>
	<label class="col-4" for="numBonbon">Bonbon à afficher :</label> 
	<form>
		<select class="col-3" id="numBonbon" name="numBonbon">
			<option value=""></option>

		</select> 
		<span class="col-5"></span>
		<button class="btn btn-info" id="sup" formAction="<%=request.getContextPath() %>/bonbon/rechercheByRef" 
				method="post">Afficher ce bonbon</button>
	</form>	
</div>
 -->

</body>
</html>