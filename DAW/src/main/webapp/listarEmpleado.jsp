<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page import="dao.EmpleadoDAO, vo.EmpleadoVO" %>
<%@ page import="java.util.List" %>

<h1>Lista de empleados</h1>

<%
List<EmpleadoVO> lista = EmpleadoDAO.obteneEmpleados();
request.setAttribute("lista", lista);
System.out.println(lista.size());
%>

<table>
<tr>
	<th>ID</th>
	<th>Nombre</th>
	<th>Password</th>
	<th>Email</th>
	<th>Zona</th>
	<th>Editar</th>
	<th>Eliminar</th>
</tr>

<c:forEach items="${lista}" var="emp">
<tr>
	<td>${emp.getId()}</td>
	<td>${emp.getNombre()}</td>
	<td>${emp.getPassword()}</td>
	<td>${emp.getEmail()}</td>
	<td>${emp.getZona()}</td>
	<td><a href="formularioEditarEmpleado.jsp?id=${emp.getId()}">Editar</a></td>
	<td><a href="eliminarEmpleado.jsp?id=${emp.getId()}">Eliminar</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>