package com.welcome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyErrorServlet")
public class MyErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(506, "Please try after this Month");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
