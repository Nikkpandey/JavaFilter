package com.myFilter;

import jakarta.security.auth.message.config.AuthConfig;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/add")
public class IDFilter implements Filter {
       

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		int id=Integer.parseInt(request.getParameter("s_id"));
		
		if(id>1) {
			chain.doFilter(request, response);
		}
		else
			out.print("Invalid Input;");
	}

	public void init(AuthConfig fConfig) throws ServletException {
		
	}

}
