package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * A servlet is a small Java program that runs within a Web server. Servlets
 * receive and respond to requests from Web clients, usually across HTTP, the
 * HyperText Transfer Protocol
 * 
 * @author Sarang Lohar
 *
 */
public class ServletInterfaceDemo implements Servlet {
	ServletConfig config = null;

	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("servlet is initialized");
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");

	}

	public void destroy() {
		System.out.println("servlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return "copyright 2007-1010";
	}

}