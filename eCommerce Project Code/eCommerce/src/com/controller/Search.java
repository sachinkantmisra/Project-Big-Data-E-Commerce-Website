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
import com.model.SolrSearch;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

public class Search extends HttpServlet{
 
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		try{		
		
		String pid = request.getParameter("pid");
		String key = request.getParameter("key");
		
	    //System.out.println(pid);
		/*Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				  "cloud_name", "ecommerce2016",
				  "api_key", "884111314597244",
				  "api_secret", "BLf9yctTp2fM-_sJjZAlLCVgLmw"));
		SingletonManager manager = new SingletonManager();
		manager.setCloudinary(cloudinary);
		manager.init();*/
		if (pid == "" && key =="")
		{
			RequestDispatcher view = request.getRequestDispatcher("errorview.jsp");
	        view.forward(request, response);
		}
	    if (pid != "")
	   {
		//CassandraSession node = new CassandraSession();
	    RedisSession rs= new RedisSession();
	    List<String> prodlst= new ArrayList<String>();
	    prodlst.add(pid);
	    //System.out.print(pid);
		List<Product> productlist= rs.cachedprod(prodlst);
		
		//System.out.println("Fetched Result from cassandra");
		//System.out.println(productlist.get(0).pdtid);
		request.setAttribute("products2", productlist);
		
	   }  
	    else if (key != "")
      {
    	  SolrSearch ss = new SolrSearch();
    	  List <Product> productlist2=ss.SolrData(key);
    	  
    	  request.setAttribute("products2", productlist2);
  		  
      }
	    
	    RequestDispatcher view = request.getRequestDispatcher("searchview.jsp");
        view.forward(request, response);
	}
	catch (Exception e) {
         e.printStackTrace();
        }
		
}
	
}
