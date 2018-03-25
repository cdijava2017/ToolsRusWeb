<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>Projet Tools'R'Us</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/style/bootstrap.min.css">

</head>
<body>


<div class="tm-3 lm-5">
	<form action="<%=request.getContextPath() %>/tools/commentaire/gestion" method="post">
		<div class="form-group row">
			<span class="col-2"></span>
			<label class="col-4" for="ref">Reference :</label> 
			<input class="col-3" id="ref" name="ref" type="number" maxlength="5" value="1" /> 
		</div> 
		
		<div class="form-group row">
			<span class="col-2"></span>
			<label class="col-4" for="nombre1">Nom :</label> 
			<input class="col-3" id="nom" name="nom" type="text" placeholder="saisir le nom ici" /> 
		</div>
		
		<div class="form-group row">
			<span class="col-2"></span>
			<label class="col-4" for="couleur">Couleur :</label> 
			<select class="col-3" id="couleur" name="couleur">
				<option value=""></option>
				<option value="Jaune">Jaune</option>
				<option value="Rouge">Rouge</option>
				<option value="Bleu">Bleu</option>
				<option value="Vert">Vert</option>
				<option value="Blanc">Blanc</option>
				<option value="Noir">Noir</option>
				<option value="Orange">Orange</option>
			</select> 
		</div>
		
		<div class="btn-group text-center mb-3">
			<input  class="btn btn-info" type="submit" value="Créer bonbon" />
			<button class="btn btn-info" id="sup" 
					formAction="<%=request.getContextPath() %>/bonbon/suppressionByRef">Supprimer par ref</button>
			<button class="btn btn-info" id="modif" 
					formAction="<%=request.getContextPath() %>/bonbon/modification">Modifier</button>
		</div>
	</form>
</div>

</body>
</html>