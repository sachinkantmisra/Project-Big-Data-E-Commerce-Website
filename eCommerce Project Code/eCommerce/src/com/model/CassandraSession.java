package com.model;



import java.util.ArrayList;
import java.util.List;

import com.dao.Product;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;


public class CassandraSession 
{
	
	/** Cassandra Cluster. */
	    Cluster cluster;
	/** Cassandra Session. */
	    Session session;
	
	public Session getSession() {
		  cluster = Cluster.builder().addContactPoint("localhost").build();
		  session= cluster.connect("ecommerce");
		  return session;
		}

	/*public Product getdata(String pid){
		System.out.println("serahcing by hitting query in cassadnra ");
		ResultSet results = getSession().execute("SELECT * FROM products where product_id= '" + pid+"'");
		Product data = new Product(null, null, null, null, null, null,null);
		for (Row row : results) 
		{
			data.pdtid = row.getString("product_id");
			data.catid = row.getString("category");
			data.pdtname = row.getString("product_name");
			data.pdtdesc = row.getString("product_description");
			Float abc= row.getFloat("price");
			data.price = Float.toString(abc);
			data.shipping = row.getString("shipping");
			data.brand = row.getString("brand");
			
		}
		
		return data;
					
	}
 */
	
public List<Product> getAlldata(List<String> cassandrapid){
		//System.out.println(querystr);
		List<Product> productlist = new ArrayList<Product>();
		//String str = "SELECT * FROM products where "+ querystr;
		//System.out.println(str);
		
		for(String pid : cassandrapid){
			//System.out.println(pid);
			ResultSet results = getSession().execute("SELECT * FROM products where product_id= '" + pid+"'");
			//System.out.println(results.toString());
			Product data = new Product(null, null, null, null, null, null,null);
			for (Row row : results) 
			{
				
				//System.out.println(row.getInt("product_id"));
				data.pdtid = row.getString("product_id");
				data.catid = row.getString("category");
				data.pdtname = row.getString("product_name");
				data.pdtdesc = row.getString("product_description");
				data.price = Float.toString(row.getFloat("price"));
				data.shipping = row.getString("shipping");
				data.brand = row.getString("brand");
				productlist.add(data);
				//System.out.println(pid);
			}	
			
			//System.out.println(pid);
			
			
		}
		
		return productlist;
		
	}
	   public void close()
	   {
	      cluster.close();
	   }
}
