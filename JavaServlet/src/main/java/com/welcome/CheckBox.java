package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBox
 */
@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
	
		PrintWriter out = res.getWriter();
		String title = "Reading Checkbox Data";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		Map<String, String> map = new HashMap<>();
		Enumeration<String> parameterName = req.getParameterNames();
		while (parameterName.hasMoreElements()) {
			String key = (String) parameterName.nextElement();
			String val = req.getParameter(key);
			System.out.println("key  " + key + "Value" + val);
			map.put(key, val);
		}

	

		// List<HttpServletRequest> collection=(List<HttpServletRequest>)
		// req.getParameterNames();
//	   Iterator<HttpServletRequest> iterator= collection.iterator();
//	   while (((Enumeration<String>) iterator).hasMoreElements()) {
//		   HttpServletRequest s1=(HttpServletRequest)iterator.next();
//		   System.out.println(s1);
//		   } 
	
		out.print(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n" + "<li><b>Maths Flag:</b>:"
				+ req.getParameter("Maths") + "</li>" + "\n" + "<li><b>Chemistry Flag:</b>:"
				+ req.getParameter("Chemistry") + "</li>" + "\n" + "<li><b>Physics Flag:</b>:"
				+ req.getParameter("Physics") + "</li>" + "\n" + "</ul>");
		out.println("<ul>");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			out.println("<li><b>"+"key : "+key+"Value  : "+val+"</b></li>");
		}
		out.println("</ul>");
		out.print("</body></html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
