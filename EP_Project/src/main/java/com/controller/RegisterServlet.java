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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
		String password=request.getParameter("psw");
		Connection conn;
		PreparedStatement ptmt;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep?useSSL=false","root","shareef@717A");
			String query="insert into register values(?,?,?,?);";
			ptmt=conn.prepareStatement(query);
			ptmt.setString(1,fname);
			ptmt.setString(2,lname);
			ptmt.setString(3,email);
			ptmt.setString(4,password);
			ptmt.execute();
			boolean flag=ptmt.execute();
			if(!flag)
			{
				RequestDispatcher rs1=request.getRequestDispatcher("login.jsp");
				rs1.include(request, response);
			}
			else
			{
				RequestDispatcher rs1=request.getRequestDispatcher("register.jsp");
				rs1.include(request, response);
			}
		}
		catch(Exception e)
		{
//			pw.print(e.getMessage());
			
		}
	}

}
