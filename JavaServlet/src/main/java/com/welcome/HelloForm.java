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
// * Servlet implementation class HelloForm
// */
//@WebServlet("/HelloForm")
//public class HelloForm extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    
//    public HelloForm() {
//        super();
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		String title = "Using GET Method to Read Form Data";
//	      String docType =
//	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
//		PrintWriter out=response.getWriter();
//		out.print( docType +"<html>\n" +
//	            "<head><title>" + title + "</title></head>\n" +
//	            "<body bgcolor = \"#f0f0f0\">\n" +
//	               "<h1 align = \"center\">" + title + "</h1>\n" +
//	               "<ul>\n" +
//	                  "  <li><b>First Name</b>: "
//	                  + request.getParameter("first_name") + "\n" +
//	                  "  <li><b>Last Name</b>: "
//	                  + request.getParameter("last_name") + "\n" +
//	               "</ul>\n" +
//	            "</body>" +
//	         "</html>"
//	      );
//	
//	}
//
//}
