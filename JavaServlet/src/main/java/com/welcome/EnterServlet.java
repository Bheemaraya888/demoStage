package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnterServlet
 */
@WebServlet("/EnterServlet")
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String title="Profile Details";
		out.print("<html>\n"+
		"<head><title>"+title+"</title></head>\n"+
		"<body>"+"<h4>Profile Deatils</h4>"+
		"<div align=\"center\" >"+"<ul>"+
		"<li>"+request.getParameter("name")+"</li>"+
		"<li>"+request.getParameter("lastName")+"</li>"+
		"<li>"+request.getParameter("phone")+"</li>"+
		"<li>"+request.getParameter("address")+"</li>"+
		"</ul>"+"</div></body></html>");
		
		RequestDispatcher rDispatcher=request.getRequestDispatcher("/sq");
		
	}
}
