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
//@WebServlet("/HelloForm1")
//public class HelloForm1 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    public HelloForm1() {
//        super();
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String title="Using GET Method to read Form Data";
//		String docType="<!doctype html public \"-//w3c//dtd html 4.0 "+"transitional //en\"\n";
//		out.println(docType+
//				"<html>\n"+
//				"<head><title>"+title+"</title></head>\n"
//				+"<body bgcolor=\"#f0f0f0>\n "+
//				"<h1 align=\"center\">"+title+"</h1>\n"+
//				"<ul>\n"+
//				"<li><b>First Name</b>:"
//				+request.getParameter("first_name")+"\n"+
//				"<li><b>Last Name</b>:"
//				+request.getParameter("last_name")+"\n"+
//				"</ul>\n"+
//				"</body>"+
//				"</html>");
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
