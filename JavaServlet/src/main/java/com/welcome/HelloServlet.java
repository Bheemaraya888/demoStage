//package com.welcome;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class HelloServlet
// */
//@WebServlet("/HelloServlet")
//public class HelloServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	 private String  message;
//	 private String name;
//	 private String company;
//       
//    public HelloServlet() {
//    	super();
//    }
//    public void init() throws ServletException{
//    	  message="Welcome to mr.";
//    	  name="Bheemaraya R";
//    	  company=" to capgemini";
//    }
//
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.print("<html><body>");
//		out.print("<h2>"+ message+"</h2>"+"<h1>"+ name+"</h1>"+"<h2>"+ company +"</h2>");
//		out.print("</body></html>");
//	}
//
//	
//
//}
