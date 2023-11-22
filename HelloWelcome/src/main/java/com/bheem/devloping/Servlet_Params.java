package com.bheem.devloping;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_Params
 */
@SuppressWarnings("serial")
@WebServlet("/params")
public class Servlet_Params extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	String name=request.getParameter("name");
	if(name==null) {
		 name="";
	}
	
	Locale locale=request.getLocale();
	String localeLangauageTag=locale.toLanguageTag().substring(0, 2);
	String greeting;
	switch (localeLangauageTag) {
	case "fr"://french
		greeting="Bonjour";
		break;
	case "de"://french
		greeting="Guten Tag";
		break;
	default:
		greeting="Hello";
		break;
	}
	
	
	
	response.getWriter().println("Hello "+name);
	}

}
