package com.loginpage;
import java.util.*;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;

import java.sql.*;
public class Dao {
static 	 String url="jdbc:mysql://localhost:3306/details";
static	 String uname="root";
static String pass="root";
static	String Driver="com.mysql.jdbc.Driver";
	//String Driver1="com.mysql.cj.jdbc.Driver";
	static Connection con=null;
	String insertQuery="insert into credentials values (?,?)";
	String insertQuery1="select * from credentials where Name=? and Password=?";
	public static Connection connect() {
		try {
		Class.forName(Driver); 
		 con=DriverManager.getConnection(url,uname,pass);	
		 return con;
		}catch (Exception e){
			
		}
		return null;
	}
	

	public boolean connection1(String cname, String cpass) {
		try {
			Connection con=Dao.connect();
		 PreparedStatement pr= con.prepareStatement(insertQuery);
			pr.setString(1,cname);
			pr.setString(2,cpass);
		   int rs=pr.executeUpdate();
		   if(rs == 1) {
			   return true;
		   }
		   pr.close();
		}
	
		catch (Exception e) {
			}
		return false;
		
	}
	public boolean Selection(String Chname,String Chpass) {
		try {
			Connection con=Dao.connect();
			 PreparedStatement pr= con.prepareStatement(insertQuery1);
			 pr.setString(1, Chname);
			 pr.setString(2, Chpass);
			 ResultSet rs=pr.executeQuery();
			if(rs.next()) {
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				if(Chname.equals(s1)&& Chpass.equals(s2)) {
				return true;
				}
			}
		}
		catch(SQLException e) {
			return false;
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	return false;	
	}
}

