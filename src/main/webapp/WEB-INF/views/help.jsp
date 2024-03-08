<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>this is help page</h1>
 
  <%
   String name= (String)request.getAttribute("name"); 
   List<String> friends = (List<String>)request.getAttribute("f");
   LocalDateTime time=(LocalDateTime)request.getAttribute("time");
   %>
     <h1>name is <%=name %></h1>
     <h1>time = <%=time %></h1> 
<!-- to use jsp expression language to print data directly first make property isELIgnored="false"  
     then directly in  ${key} pass key in mentioned syntax no need to write extra code of request.getAttribute()
     for taglib add jstl dependency in pom-->
       <h1>${name}</h1>
       <h1>${marks}</h1>
       <c:forEach var ="item" items="${marks}"> <h1>
       ${item }</h1>
       </c:forEach>
</body>
</html>