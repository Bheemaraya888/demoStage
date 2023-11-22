<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is the first JSP page</title>
</head>
<body>
	<%-- <c:set var="languageCode" value='fr' />

	<c:choose>
		<c:when test="${languageCode=='fr'}">
		Bonjour
		</c:when>

		<c:when test="${languageCode=='de'}">
		Guten Tag
		</c:when>

		<c:otherwise>
		Hello
		</c:otherwise>
		
		${param.name}
	</c:choose> --%>
	<h1>
		<b><i>Hello <%= request.getParameter("name") %></i></b>
	</h1>
	<p bgcolor="cyan">
	<b><pre>
		Dear ${param.name},
		welcome to Capgemini. 
		We are very happy to announce  you are a part of company. 
		Dear ${param.name},
		welcome to Capgemini. 
		We are very happy to announce  you are a part of company. 
		Dear ${param.name},
		welcome to Capgemini. 
		We are very happy to announce  you are a part of company. 
		Dear ${param.name},
		welcome to Capgemini. 
		We are very happy to announce  you are a part of company. 
		Dear ${param.name},
		welcome to Capgemini. 
		We are very happy to announce  you are a part of company. 
		Dear ${param.name},
		welcome to Capgemini. 
		We are very happy to announce  you are a part of company. 
		</pre></b>
	</p>

</body>
</html>