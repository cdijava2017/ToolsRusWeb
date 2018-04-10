<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>exo2Biblio</title>
<link href="<%=request.getContextPath()%>/css/biblio.css" rel="stylesheet" type="text/css" />
</head>
<body>



	<h1>Accueil principal exo2Biblio !</h1>
	<br></br>
	<h1><s:a namespace="/vue" action="afficheMsg">vers AfficheMessage</s:a></h1>
	
</body>
</html>