<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang=fr>
	<head>
	
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
			<link rel="stylesheet"  type ="text/css " href="<%=request.getContextPath()%>/style/Menu.css"/>
		 	
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Formulaire Mot</title>
		
	</head>
<body>
		<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
		
				
		<div class="container">
			  <h2>Enregistrer un mot dans la base</h2>
			  <s:form id="mot" action="CudMot" namespace="/uc4mot" method="post" validate="false">
			    <div class="form-group">
			      <s:label for="word">Mot:</s:label>
			      <input type="text" class="form-control" id="mot" placeholder="ajouter un mot" name="mot">
			    </div>
			     <br>                                   
				<div class="dropdown">
				   <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Catégories
				    <span class="caret"></span></button>
				    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
				      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Humeur</a></li>
				      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Theme réunion</a></li>
				      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Autre</a></li>
				    </ul>
				  </div>
				  
				<br>
			    <button type="submit" class="btn btn-default">Enregistrer</button>
			  </s:form>
			  <s:property value="msgRetour" />
		</div>
		
	
	<!--<script src="<%=request.getContextPath()%>/script/scriptMenu2.js" charset="UTF-8"></script>-->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>