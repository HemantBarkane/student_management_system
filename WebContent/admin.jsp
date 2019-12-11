
   <%@taglib prefix="spr" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spr:form action="admin_login" commandName="admin" align="center" >
<table>
<tr>
<td>UserName</td>
	<td><spr:input path="adminName" /></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><spr:password path="adminPass" /></td>
	</tr>
	
	<tr>
	<td></td>
	<td><button type="submit">login</button></td>
	</tr>
  </spr:form>
</table>
</body>
</html>