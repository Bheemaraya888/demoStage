package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubsServlet
 */
@WebServlet("/SubsServlet")
public class SubServlet extends HttpServlet {
	    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	    	int i=Integer.parseInt(req.getParameter("num1"));
	    	int j=Integer.parseInt(req.getParameter("num2"));
	    	int k=i-j;
	    	
	    	Cookie cookie=new Cookie("k", k+"");
	    	res.addCookie(cookie);
	    	res.sendRedirect("sq");
	    	
}
}
