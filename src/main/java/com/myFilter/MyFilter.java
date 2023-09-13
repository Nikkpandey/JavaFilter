package com.myFilter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class MyFilter extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException {
		PrintWriter out=res.getWriter();
		
		int id=Integer.parseInt(req.getParameter("s_id"));
		String name=req.getParameter("s_name");
		
		out.println("Welcome "+name);
	}

}
