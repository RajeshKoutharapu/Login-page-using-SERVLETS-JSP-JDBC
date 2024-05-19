package com.loginpage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/selection")
public class select extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("checkname");
	String pass=request.getParameter("checkpass");
	//request.setAttribute("uname",name);
	
	//PrintWriter out=response.getWriter();
	  
	   if(name.isEmpty()|| pass.isEmpty()) {
		   response.sendRedirect("Errorpage.jsp");
	   }else {
		        Dao obj=new Dao();
	            boolean res= obj.Selection(name, pass);
	 if(res) {
		 response.sendRedirect("Welcome.jsp");
	        }
	 else {
		 response.sendRedirect("Errorpage.jsp");
	    }
	
        	}
	 //  RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		//rd.forward(request, response);
	}

	
}
