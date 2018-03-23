<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
test affichage accueil
<a href="" id="button-1" data-rel="external" class="ui-btn ui-icon-comment ui-btn-icon-right ui-btn-inline ui-corner-all ui-btn-b">Commentaires</a>
<a href="#popup" data-transition="fade" data-position-to="origin" data-rel="popup" class="ui-btn ui-corner-all ui-alt-icon ui-shadow ui-btn-inline ui-icon-info ui-btn-icon-notext" title="Popup">Popup</a>
<div data-role="popup" id="popup" data-arrow="true" data-theme="b" class="ui-content" data-overlay-theme="b">
	<a href="#" data-rel="back" class="ui-btn ui-corner-all ui-shadow ui-btn-inline ui-btn-a ui-icon-delete ui-btn-icon-notext ui-btn-right">Close</a>
	<p>Ce bouton renvoi vers la partie "Commentaire - UC3_Donner_un_avis"</p>
</div>
</body>
</html>
