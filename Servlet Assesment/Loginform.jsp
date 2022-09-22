<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Information</title>
</head>
<body>

<form action="Task1" method="post">
 <center>
  <br> <% out.print("Welcome to JSP"); %></br>
   <table style="with: 100%">
    <tr>
     <td>FirstName</td>
     <td><input type="text" name="firstname" /></td>
    </tr>
    <tr>
     <td>LastName</td>
     <td><input type="text" name="Lastname" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
 </table>
   <br><input type="submit" value="Submit" /></br>
   </center>
  </form>

</body>
</html>