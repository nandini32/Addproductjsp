package com.phase2.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/product")
public class ProductId extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pId = request.getParameter("productId");
		String pName = request.getParameter("productName");
		String pPrice = request.getParameter("productPrice");
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("pid", pId);
		theSession.setAttribute("pname", pName);
		theSession.setAttribute("pprice", pPrice);
		
		response.sendRedirect("Display.jsp");
		
	}
	}