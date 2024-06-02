<%-- 
    Document   : findstudent_outcome
    Created on : May 23, 2024, 8:57:42 PM
    Author     : THINK 5
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Student Outcome Page</title>
    </head>
    <body>
        <h1>Find Student outcome</h1>
        <%
            Student stud = (Student)request.getAttribute("stud");
            String name = stud.getName();
            Long studNum = stud.getStudNum();
            Long age = stud.getAge();
        %>
        <p>
            The student has been found. Below is the student.
        </p>
        <table>
            <tr>
                <td><b>Name</b></td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td><b>Age</b></td>
                <td><%=age%></td>
            </tr>
            <tr>
                <td><b>Student number</b></td>
                <td><%=studNum%></td>
            </tr>
        </table>
            <p>
            Please click <a href="menu.html">here</a> to go back to menu page or
            Click <a href="LogoutServlet.do">here</a> to logout.
            </p>
    </body>
</html>
