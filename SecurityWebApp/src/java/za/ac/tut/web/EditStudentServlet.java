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
public class EditStudentServlet extends HttpServlet {
@EJB private StudentFacadeLocal st;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long studNum = Long.parseLong(request.getParameter("studNum"));
        Long age = Long.parseLong(request.getParameter("age"));
        String location = "editstudent_outcome.jsp";
                
        Student stud = st.findStudent(studNum);
        
        if(stud == null){//check if student is found
            location = "studentnotfound.jsp";
        } else {
            Student student = modifyStudent(stud, age);
            st.editStudent(student);
        }
        
        
        RequestDispatcher disp = request.getRequestDispatcher(location);
        disp.forward(request, response);
    }

    private Student modifyStudent(Student stud, Long age) {
        stud.setAge(age);
        return stud;
    }

}

    