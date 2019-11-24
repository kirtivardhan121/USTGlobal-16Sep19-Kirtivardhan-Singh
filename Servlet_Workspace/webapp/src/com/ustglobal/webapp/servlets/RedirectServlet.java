package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RedirectServlet extends HttpServlet {



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String select = req.getParameter("select");
		String search = req.getParameter("search");
		
		if(select.equals("Bing")) {
			resp.sendRedirect("https://www.bing.com/search?q=" +search);
			
		} else if(select.equals("Google")) {
			resp.sendRedirect("https://www.google.com/search?q=" +search);
			
		} else {
			resp.sendRedirect("https://www.yahoo.com/search?q=" +search);
			
		}
		
	
	}//end of doGet()

}//end of RedirectServlet
