package com.loginpage;
import com.loginpage.Dao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
@WebServlet("/insersion")
public class insert extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Cname=request.getParameter("name");
		String Cpass=request.getParameter("password");
		String Cpasstemp=request.getParameter("Conformpass");
		//PrintWriter out=response.getWriter();
		if(Cpass.isEmpty() || Cname.isEmpty()) {
			response.sendRedirect("Errorpage.jsp");
		}
	  else {
		//  int result = Cpass.compareTo(Cpasstemp);
		  if(Cpass.equals(Cpasstemp)) {
			  Dao obj=new Dao();
			boolean bb=	obj.connection1(Cname,Cpass);
			  if(bb) {
				   response.sendRedirect("return to login.jsp");
				}else {
					   response.sendRedirect("Errorpage.jsp");
				      }
				}
		           else {
					response.sendRedirect("Errorpage.jsp");
				     }
	  }
		
			}
		}

	
