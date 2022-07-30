package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplyServlet
 */
@WebServlet("/ApplyServlet")
public class ApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyServlet() {
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
		String firstname=request.getParameter("firstname");
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastname");
		String Nationality=request.getParameter("Nationality");
		String gender=request.getParameter("gender");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String retypepassword=request.getParameter("re-typepassword");
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
		String password1=request.getParameter("psw");
		Connection conn;
		PreparedStatement ptmt;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep?useSSL=false","root","shareef@717A");
			String query="insert into register values(?,?,?,?,?,?,?,?,?,?,?);";
			ptmt=conn.prepareStatement(query);
			ptmt.setString(1,firstname);
			ptmt.setString(2,middlename);
			ptmt.setString(3,lastname);
			ptmt.setString(4,Nationality);
			ptmt.setString(5,gender);
			ptmt.setString(6,phone);
			ptmt.setString(7,address);
			ptmt.setString(8,email);
			ptmt.setString(9,password);
			ptmt.setString(10,retypepassword);
			
			ptmt.execute();
			boolean flag=ptmt.execute();
			if(!flag)
			{
				RequestDispatcher rs1=request.getRequestDispatcher("Apply.jsp");
				rs1.include(request, response);
			}
			else
			{
				RequestDispatcher rs1=request.getRequestDispatcher("Apply.jsp");
				rs1.include(request, response);
			}
		}
		catch(Exception e)
		{
//			pw.print(e.getMessage());
			
		}
	}

}
