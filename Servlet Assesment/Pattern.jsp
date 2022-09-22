<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<%   
  
 
  
for(int i=1;i<=5;i++)  
{  
    for(int j=1;j<=5-i;j++)  
    {  
        out.print("*");  
    }  
      for(int k=1;k<=i*2-1;k++){
    	 out.print("");
    }
    out.print("<br>");
      
}  
  
%>  

</body>
</html>