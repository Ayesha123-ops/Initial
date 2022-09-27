<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="ayesha.user"%>"C:/Users/Arslan/eclipse-workspace/Form/src/main/java/ayesha/user.java"
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
</head>
<body>
<%
List<user> list = new ArrayList<>();
list = (List) request.getAttribute("userlist");
for(int i =0; i<list.size();i++){
	out.println(list.get(i).toString());
	out.println("</br>");
	
}
%>

</body>
</html>