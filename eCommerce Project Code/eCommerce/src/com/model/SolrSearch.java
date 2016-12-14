package com.model;


import org.apache.solr.client.solrj.impl.HttpSolrServer;

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

import com.dao.Product;

public class SolrSearch {

	public List<Product> SolrData( String str) 
	{
		
		List<Product> productlist=new ArrayList<Product>();
		HttpSolrServer solr = new HttpSolrServer("http://localhost:8983/solr/products");

	    SolrQuery query = new SolrQuery();
	    query.setQuery("product_name:"+""+str+""+"~0.7"+" OR "+" product_description:"+""+str+""+"~0.7");
	   
	  // query.setRequestHandler("/select");
	    //query.addFilterQuery("cat:electronics","store:amazon.com");
	   // query.setFields("id","name","cat");
	    //query.setStart(0);    
	    query.set("defType", "edismax");
	    query.set("wt", "json");
	    query.set("indent", true);
	    
	   
try{
	
	RedisSession rs= new RedisSession();
	
	
	    QueryResponse response = solr.query(query);
	    SolrDocumentList results = response.getResults();
	    
	    List<String> pidlist= new ArrayList<String>();
	    
	    for (int i = 0; i < results.size(); ++i) 
	    { 	
	    	pidlist.add((String) results.get(i).getFieldValue("id"));
	        
	     }
	    
	    productlist= rs.cachedprod(pidlist);
	  
		
	}catch(Exception e ){
	
	System.out.println(e.toString());
 }
return productlist;	
}
	

}

