<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.EmpleadoDAO" %>
<jsp:useBean id="e" class="vo.EmpleadoVO"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>

<%

int resultado = EmpleadoDAO.guardarEmpleado(e);
if(resultado>0){
	response.sendRedirect("exitoGrabarEmpleado.jsp");
} else{
	response.sendRedirect("errorGrabarEmpleado.jsp");
}

%>