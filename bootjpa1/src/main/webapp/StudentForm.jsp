<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addStudent">

student id:<input type="number"name="id"/><br>
student name:<input type="text"name="name"/><br>
student tech:<input type="text"name="tech"/><br>
<input type="submit"value="addStudent"/><br>
</form>
<form action="getStudent">
student id:<input type="number"name="id"/><br>
<input type="submit"value="getStudentById"/>
</form>
</body>
</html>