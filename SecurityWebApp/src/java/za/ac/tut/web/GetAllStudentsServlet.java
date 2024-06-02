/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class GetAllStudentsServlet extends HttpServlet {
@EJB private StudentFacadeLocal st;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
        List<Student> list = st.findAllStudent();
        request.setAttribute("list", list);
       
        RequestDispatcher disp = request.getRequestDispatcher("getallstudents_outcome.jsp");
        disp.forward(request, response);
    }
}