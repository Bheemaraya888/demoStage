package com.bheem.devloping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSTLServletClass
 */
@WebServlet("/JSTLServletClass")
public class JSTLServletClass extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> li=Arrays.asList(new Student(1, "Bheemaraya R"),new Student(2, "Badri Narayana S"),new Student(3, "Deeskshith SR"),new Student(4, "Abhishek H"));
	
		
		PrintWriter out=response.getWriter();
		
	request.setAttribute("students", li);
	
	
		RequestDispatcher rd= request.getRequestDispatcher("display.jsp");
	rd.forward(request, response);
	}


}
