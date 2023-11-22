package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		
		Cookie cookie[]=req.getCookies();
		for (Cookie cookie2 : cookie) {
			if(cookie2.getName().equals("k")) {
				k=Integer.parseInt(cookie2.getValue());
			}
		}
		
		k=(int) Math.pow(k, 2);
    	PrintWriter out=res.getWriter();
    	out.print("<b> The result of power is "+k+"</b>");
	}
}
