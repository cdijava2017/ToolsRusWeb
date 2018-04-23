<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang=fr>
<head>
	<link rel="stylesheet"  type ="text/css " href="<%=request.getContextPath()%>/style/Menu.css"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Accueil enrichir la base</title>
</head>

<body>

	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
	<br>
		<div class="container">           
	  		<s:a namespace="/uc4" action="formulaireUc4">
	  			<button type="button" class="btn btn-info btn-block">GERER LES MOTS</button>
	  		</s:a>
	  		
		</div>
		<br>
		<div class="container">
			<s:a namespace="/uc4" action="formulaireImageUc4">          
	  		<button type="button" class="btn btn-info btn-block">GERER LES IMAGES</button>
	  		</s:a>
		</div>
		<br>
		<div class="container"> 
			<s:a namespace="/uc4listmot" action="listmot">         
	  		<button type="button" class="btn btn-info btn-block">LISTE DES MOTS</button>
	  		</s:a>
		</div>
		<br>
		<div class="container">
			<s:a namespace="/uc4" action="listeImageUc4">          
	  		<button type="button" class="btn btn-info btn-block">LISTE DES IMAGES</button>
	  		</s:a>
		</div>
	
	<script src="<%=request.getContextPath()%>/script/scriptMenu2.js" charset="UTF-8"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>