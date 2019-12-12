<%@page import="com.example.dto.Student"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% 
	
    List<Student> alist = (List<Student>)request.getAttribute("alist");

    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" align="center"  >
      <thead>
       <tr>
        <th colspan="7" style="text-align: center" > STUDENT  LIST</th>  
       </tr>
       <tr>
        <th>STUDENT ID</th>
        <th>FIRST NAME</th>
        <th>LAST NAME</th>
        <th>BRANCH</th>
        <th>SCHOOL</th>
        <th>GENDER</th>

       </tr>
      </thead>
      <tbody>
     <% for(Student a : alist){ %>  
       <tr>
        <td><%=a.getsId()%></td>      
        <td><%=a.getFname()%></td>
        <td><%=a.getLname()%></td>      
        <td><%=a.getBranch()%></td>      
        <td><%=a.getSchool()%></td>      
        <td><%=a.getGender()%></td>        
        <td><a href="delete_student?sId=<%=a.getsId()%>" >Delete</a></td>
        <td><a href="student_update?sId=<%=a.getsId()%>">Select</a></td>
       </tr>
       <% } %>
      </tbody>
     </table>
 


</body>
</html>