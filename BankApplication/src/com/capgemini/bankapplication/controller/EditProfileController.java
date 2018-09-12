package com.capgemini.bankapplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editprofile")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditProfileController() {
        super();
    }
    private ServletContext context ;
    @Override
    public void init(ServletConfig config) throws ServletException {
    	context=config.getServletContext() ;
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter() ;
		String uname=request.getParameter("username") ;
		String oldpass=request.getParameter("oldpass") ;
		String newpass=request.getParameter("newpass") ;

		HashMap<String,String> users=new HashMap<>() ;		
		if(users.containsKey(uname)) {
			if(users.get(uname).equals(oldpass))
			{
				out.println("<h1>Profile updated successfully :"+uname+"</h1>");
				
			}
				
			else
			{
				out.println("<h3>Invalid Credentials</h3>");
				out.print("<br><br><a href='editprofile.jsp'>Try Again</a>");
			}
		}
			else
			{
				out.println("<h3>successfully created newpassword</h3>");
				out.print("<br><br><a href='editprofile.jsp'>Try Again</a>");
			}
	}


	
	}


