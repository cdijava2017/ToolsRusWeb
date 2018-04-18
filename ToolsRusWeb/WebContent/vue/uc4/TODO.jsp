<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html lang=fr>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet"  type ="text/css " href="<%=request.getContextPath()%>/style/Menu.css"/>
<title>EN CONSTRUCTION</title>
</head>
<body>
	<jsp:include page="/WEB-INF/include/NavBar.jsp"></jsp:include>
	
	
		<H1>EN CONSTRUCTION</H1>
		
		<s:a namespace="/uc4" action="accueilUc4">
			 <button type="submit" class="btn btn-default">Accueil</button>
		</s:a>
	<script src="<%=request.getContextPath()%>/script/scriptMenu2.js" charset="UTF-8"></script>
</body>
</html>