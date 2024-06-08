package com.aniket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/bye", loadOnStartup=9,
			initParams= {
					@WebInitParam(name="color", value="aqua"),
					@WebInitParam(name="course", value="dac")
			})
		

public class ByeServlet extends HttpServlet {
	private String color="";
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("ByeServlet init() called");
		color= config.getInitParameter("color");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("ByeServlet destroy() called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("deGet() called");
		processRequest(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost() called");
		processRequest(req, resp);
	}
	
	

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My webbsite</title>");
		out.println("</head>");
		out.printf("<body bgcolor='%s'>\n", color);
		out.println("<h1>Hello, India</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	
	
	
}
