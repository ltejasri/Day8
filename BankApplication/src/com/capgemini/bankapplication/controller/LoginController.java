package com.capgemini.bankapplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
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
		String pass=request.getParameter("password") ;
		
HashMap<String,String> users=new HashMap<>() ;
users.put("neeraj", "tejasri");
		
		if(users.containsKey(uname)) {
			if(users.get(uname).equals(pass))
				out.println("<h1>Welcome :"+uname+"</h1>");
			else
			{
				out.println("<h3>Invalid Credentials</h3>");
				out.print("<br><br><a href='login.jsp'>Try Again</a>");
			}
		}
			else
			{
				out.println("<h3>User not Found</h3>");
				out.print("<br><br><a href='login.jsp'>Try Again</a>");
			}
	}


	}


