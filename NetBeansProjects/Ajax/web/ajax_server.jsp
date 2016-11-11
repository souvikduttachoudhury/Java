
<%@page import="javax.servlet.*" %>

<%@page import="javax.servlet.http.*" %>

<%@page import="java.util.*,java.sql.*,java.io.*" %>
<%
    String txt;
    
    txt=request.getParameter("name");
    out.write("This is my "+txt);
%>