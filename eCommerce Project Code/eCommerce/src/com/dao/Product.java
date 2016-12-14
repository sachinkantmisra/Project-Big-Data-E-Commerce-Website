package com.dao;

public class Product extends Thread{
	 
	 public String pdtid;
	 public String catid;
	 public String pdtname;
	 public String pdtdesc;
	 public String price;
	 public String shipping;
	 public String brand;
	 
	 public Product(String spdtid, String scatid, String spdtname, 
			 String spdtdesc,String sshipping, String sbrand,String sprice) {
		 pdtid = spdtid;
		 catid = scatid;
		 pdtname = spdtname;
		 pdtdesc = spdtdesc;
		 shipping = sshipping;
		 brand=sbrand;
		 price = sprice;
	 }

	public String getPdtid() {
		return pdtid;
	}

	public void setPdtid(String pdtid) {
		this.pdtid = pdtid;
	}

	public String getCatid() {
		return catid;
	}

	public void setCatid(String catid) {
		this.catid = catid;
	}

	public String getPdtname() {
		return pdtname;
	}

	public void setPdtname(String pdtname) {
		this.pdtname = pdtname;
	}

	public String getPdtdesc() {
		return pdtdesc;
	}

	public void setPdtdesc(String pdtdesc) {
		this.pdtdesc = pdtdesc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	 
	
}
