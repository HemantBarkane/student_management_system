<%@taglib prefix="spr" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spr:form action="studentAdd" commandName="student">
First Name:<spr:input path="Fname" /><br><br>
Last Name :<spr:input path="Lname" /><br><br>
Branch	  :<spr:input path="branch" /><br><br>
School    :<spr:input path="school" /><br><br>
Gender:
Male<spr:radiobutton path="gender" value="Male" />
Female<spr:radiobutton path="gender" value="Female" /><br><br>
<button type="submit">Save</button>

</spr:form>
</body>
</html>