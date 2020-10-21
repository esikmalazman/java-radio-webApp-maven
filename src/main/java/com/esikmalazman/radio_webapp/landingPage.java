package com.esikmalazman.radio_webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/landingPage","/radioWeb"})
public class landingPage extends HttpServlet {
	
	private static final long serialVersionUID=1L;
	
	public  landingPage() 
	{
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		ServletOutputStream out = response.getOutputStream();
		
       RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/html/index.html");
       
       rd.include(request, response);
       String htmlResponse ="<html><head></head><body style='text-align :center !important;'><section>";
       htmlResponse ="</section></body></html>";
//		
		out.println(htmlResponse);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		
		
		this.doGet(request, response);
	}
	
	

}

