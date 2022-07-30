package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String email=request.getParameter("email");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String password=request.getParameter("psw");
		Connection conn;
		PreparedStatement ptmt;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep?useSSL=false","root","shareef@717A");
			String query="select * from register where email=? and password=?;";
			ptmt=conn.prepareStatement(query);
			ptmt.setString(1,email);
			ptmt.setString(2, password);
			ptmt.execute();
			ResultSet rs=ptmt.executeQuery();
			if(rs.next())
			{
				
				pw.print("Welcome, "+email);
				RequestDispatcher rs1=request.getRequestDispatcher("home.jsp");
				rs1.include(request, response);
			}
			else
			{
				pw.print("Sorry username and password not found");
				RequestDispatcher rs1=request.getRequestDispatcher("login.jsp");
				rs1.include(request, response);
			}
		}
		catch(Exception e)
		{
			pw.print(e.getMessage());
		}
	}

}
