package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitForm1")
public class MyServlet extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	
		String mysearch = req.getParameter("search");
		
//		res.sendRedirect("https://www.google.com");
		res.sendRedirect("https://www.linkedin.com/in/kundan-gupta-b3157a229/");
		
			
	}
}
