<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${students}" var="s">
		
		<c:out value="${s}"></c:out>
		
		<br>
		
	</c:forEach>
	
	<%-- 
	<c:set value="I am very upset today" var="s"></c:set>
	<c:out value="${fn:length(s)}">
	</c:out>
	<c:forEach items="${fn:split(s,'a')}" var="s">
${s}
</c:forEach>
	<c:set value="I am is very upset today " var="s" />
	index:${fn:indexOf(s,"is")}
	<br> Is There : ${fn:contains(s,"is")} --%>
</body>
</html>