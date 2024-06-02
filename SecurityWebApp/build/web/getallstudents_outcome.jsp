<%-- 
    Document   : getallstudents_outcome
    Created on : May 23, 2024, 9:20:03 PM
    Author     : THINK 5
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Students Page</title>
    </head>
    <body>
        <h1>View All</h1>
        <%
            List<Student> list = (List<Student>)request.getAttribute("list");
            
        %>
        <table>
            <%
                for(int i=0; i < list.size(); i++){
                   Student stud = list.get(i);
                   String name = stud.getName();
                   Long studNum = stud.getStudNum();
                   Long age = stud.getAge();
                
            %>
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
            <%
                }
            %>
        </table>
        <p>
            Please click <a href="menu.html">here</a> to go back to menu page or
            Click <a href="LogoutServlet.do">here</a> to logout.
        </p>
    </body>
</html>
