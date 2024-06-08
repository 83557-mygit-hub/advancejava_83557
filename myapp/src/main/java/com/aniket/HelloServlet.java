package com.aniket;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("HelloServlet.init() called");
	} 
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("helloServlet.destroy() called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("helloServlet.doGet() called");
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("helloServlet.doPost() called");
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Website</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome to my website!</h1>");
		Date now =new Date();
		out.println(now.toString());
		out.println("</body>");
		out.println("</html>");
		
	}
}


