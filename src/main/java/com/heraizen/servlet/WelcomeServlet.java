package com.heraizen.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class WelcomeServlet extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		String name = req.getParameter("name");
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head>");
		sb.append("<title>Welcome</title>");
		sb.append("</head><body>");
		   
		sb.append("<h1> Welcome!! to my new <b>Servlet</b> app: ");
		sb.append((name!=null && !name.isEmpty() ? name : "Guest") + " at " + LocalDate.now());
		sb.append("</h1>");
		    
		sb.append("</body></html>");
		    
		writer.print(sb.toString());
		
	}
	
}
