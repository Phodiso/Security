/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author THINK 5
 */
public class FindStudentServlet extends HttpServlet {
@EJB private StudentFacadeLocal st;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long studNum = Long.parseLong(request.getParameter("studNum"));
       
        Student stud = st.findStudent(studNum);
        request.setAttribute("stud", stud);
        
        RequestDispatcher disp = request.getRequestDispatcher("findstudent_outcome.jsp");
        disp.forward(request, response);
    }
}
