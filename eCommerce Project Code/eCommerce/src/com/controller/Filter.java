package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.Product;
import com.model.RedisSession;



public class Filter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
		
		String pid= request.getParameter("prodid");
		System.out.println(pid);
		RedisSession rs= new RedisSession();
		List<String> prod= new ArrayList<String>();
		prod.add(pid);
	    List<Product> product= rs.cachedprod(prod);
		
		
		request.setAttribute("product", product);
		
		RequestDispatcher view = request.getRequestDispatcher("product.jsp");
	        view.forward(request, response);
		}
		catch (Exception e) {
	         e.printStackTrace();
	        }
	    
	}
}
