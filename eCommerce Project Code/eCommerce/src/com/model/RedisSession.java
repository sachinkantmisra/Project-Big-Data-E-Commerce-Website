package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import com.dao.Product;
public class RedisSession 
{
	Jedis jedis = new Jedis("localhost");
	
	CassandraSession node = new CassandraSession();

	public  List<Product> cachedprod(List<String> pid) {
	
		
		Map<String, String> ProdHashMap = new HashMap <String, String> ();
		List<Product> productlist = new ArrayList<Product>();
		List<String> cassandrapid = new ArrayList<String>();
		
		for ( String member : pid)
		{
			 if (jedis.exists("prodId:"+member))
			 {
				 //System.out.println("Fetching %d from Cache"+jedis.get("prodID:"+member) );
				 
				 Product product = new Product(null, null, null, null, null, null,null); 
				 ProdHashMap = jedis.hgetAll("prodId:"+member);
				 product.pdtid = ProdHashMap.get("pdtid");
				 product.pdtdesc=ProdHashMap.get("pdtdesc");
				 product.catid=ProdHashMap.get("catid");
				 product.pdtname=ProdHashMap.get("pdtname");
				 product.price=ProdHashMap.get("price");
				 product.shipping=ProdHashMap.get("shipping");
				 product.brand=ProdHashMap.get("brand");
				 
				 productlist.add(product);
				 
			}
			 else{
					cassandrapid.add(member);
				 }
			
			
		}
		
		if(cassandrapid.size()>0 )
		{
			
			
			List<Product> pdli = node.getAlldata(cassandrapid);
			productlist.addAll(pdli);
			
			for( Product pd : pdli)
			{
				ProdHashMap.put("pdtid", pd.pdtid);
				  ProdHashMap.put("catid", pd.catid);
				  ProdHashMap.put("pdtname", pd.pdtname);
				  ProdHashMap.put("pdtdesc", pd.pdtdesc);
				  ProdHashMap.put("price", pd.price);
				  ProdHashMap.put("shipping", pd.shipping);
				  ProdHashMap.put("brand", pd.brand);
				
				 jedis.hmset("prodId:" + pd.pdtid, ProdHashMap);
				
				 jedis.expire("prodId:"+pd.pdtid, 120);
						
			}
				
			node.close(); 	
			
		}
		  
		  		return productlist;
		
	}
	
}
