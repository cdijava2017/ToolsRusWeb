<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang=fr>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet"  type ="text/css " href="<%=request.getContextPath()%>/style/Menu.css"/>
	<title>Liste des mots</title>
</head>
<body>
			<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
			
		<s:form action="suppmot" namespace="/uc4suppmot">
			<div class="container">
			  <div class="table-responsive">          
				  <table class="table">
				    <thead>
				      <tr>
				        <th>choix</th>
				        <th>libelle du mot</th>
				        <th>catégorie</th>
				      </tr>
				    </thead>
				    <tbody>
				       
				      	<s:iterator value="listMot">
				      		
					      	<tr id="<s:property value="idMot"/>">
						        <td><s:checkbox name="choix" id="{idMot}" theme="simple" value=""/></td>
						        <td><s:property value="libelleMot"/></td>
						        <td><s:property value="categorie"/>humeur</td>
						    </tr>
					    </s:iterator>
				      
				    </tbody>
				  </table>
			  </div>
			
			<div>
				<s:a namespace="/uc4suppmot" action="suppmot">
					<button type="submit" class="btn btn-default" name="supprimer" id="supprimer">supprimer</button>
				</s:a>
			</div>
			<br>
			<div>
				<s:a namespace="" action="">
					<button type="submit" class="btn btn-default">modifier</button>
				</s:a>
			</div>
			<br>
			<div>
				<s:a namespace="/uc4" action="accueilUc4">
					 <button type="submit" class="btn btn-default">Accueil</button>
				</s:a>
			</div>
		</div>
	</s:form>
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/script/scriptMenu2.js" charset="UTF-8"></script>
	<script src="<%=request.getContextPath()%>/script/listeMot.js" charset="UTF-8"></script>
</body>
</html>