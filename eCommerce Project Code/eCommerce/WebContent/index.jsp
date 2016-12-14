 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>eShop</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--[if lte IE 6]><link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" /><![endif]-->
	
	
	<!-- JS -->
	<script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>	
	<script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>	
	<script src="js/jquery-func.js" type="text/javascript"></script>	
	<!-- End JS -->
	
</head>
<body>
	
<!-- Shell -->	
<div class="shell">
	
	<!-- Header -->	
	<div id="header">
		<h1 id="logo"><a href="/eCommerce">eShop</a></h1>	
		
		<!-- Cart -->
		<div id="cart">
			<a href="#" class="cart-link">Your Shopping Cart</a>
			<div class="cl">&nbsp;</div>
			<span>Articles: <strong>0</strong></span>
			&nbsp;&nbsp;
			<span>Cost: <strong>$0.0</strong></span>
		</div>
		<!-- End Cart -->
		
		<!-- Navigation -->
		<div id="navigation">
			<ul>
			    <li><a href="/eCommerce" class="active">Home</a></li>
			    <li><a href="#">Support</a></li>
			    <li><a href="#">My Account</a></li>
			    <li><a href="#">The Store</a></li>
			    <li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- End Navigation -->
	</div>
	<!-- End Header -->
	
	<!-- Main -->
	<div id="main">
		<div class="cl">&nbsp;</div>
		
		<!-- Content -->
		<div id="content">
			
			<!-- Content Slider -->
			<div id="slider" class="box">
				<div id="slider-holder">
					<ul>
					    <li><a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627744/slide1_fgzfbe.png" alt="" /></a></li>
					    <li><a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627745/slide2_hdmm1g.png" alt="" /></a></li>
					    <li><a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627743/slide3_tivj3g.jpg" alt="" /></a></li>
					    <li><a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627744/slide4_tlzv8d.jpg" alt="" /></a></li>
					</ul>
				</div>
				<div id="slider-nav">
					<a href="#" class="active">1</a>
					<a href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
				</div>
			</div>
			<!-- End Content Slider -->
			
			<!-- Products -->
			<div class="products">
				<div class="cl">&nbsp;</div>
				<ul>
				    <li>
				    	<a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627949/big1_z1jnpr.jpg" alt="" /></a>
				    	<div class="product-info">
				    		<h3>TimberLand</h3>
				    		<div class="product-desc">
								<h4>Men</h4>
				    			<p>Jacket Black<br />Size M</p>
				    			<strong class="price">$58.99</strong>
				    		</div>
				    	</div>
			    	</li>
			    	<li>
				    	<a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627949/big2_dc7dlm.jpg" alt="" /></a>
				    	<div class="product-info">
				    		<h3>Levis</h3>
				    		<div class="product-desc">
								<h4>Kids</h4>
				    			<p>Jacket Blue<br />Size S</p>
				    			<strong class="price">$48.99</strong>
				    		</div>
				    	</div>
			    	</li>
			    	<li class="last">
				    	<a href="#"><img src="http://res.cloudinary.com/ecommerce2016/image/upload/v1461627949/big3_eyb0rq.jpg" alt="" /></a>
				    	<div class="product-info">
				    		<h3>Jack n Jones</h3>
				    		<div class="product-desc">
								<h4>WOMEN</h4>
				    			<p>Jacket Black<br />Size M</p>
				    			<strong class="price">$44.99</strong>
				    		</div>
				    	</div>
			    	</li>
				</ul>
				<div class="cl">&nbsp;</div>
			</div>
			<!-- End Products -->
			
		</div>
		<!-- End Content -->
		
		<!-- Sidebar -->
		<div id="sidebar">
			
			<!-- Search -->
			<div class="box search">
				<h2>Search by <span></span></h2>
				<div class="box-content">
					<form action="Search" method="post">
						
						<label>Keyword</label>
						<input type="text" class="field" name="key" id="desc" />
						
						<label>Product ID</label>
						<input type="text" class="field" name="pid" id="pid"/>
					
						<input type="submit" class="search-submit" value="Search" />
						
						
					</form>
				</div>
			</div>
			<!-- End Search -->
			
			<!-- Categories -->
			<div class="box categories">
				<h2>Categories <span></span></h2>
				<div class="box-content">
					<ul>
					    <li><a href="#">Books</a></li>
					    <li><a href="#">Home Appliance</a></li>
					    <li><a href="#">Laptop</a></li>
					    <li><a href="#">Bags</a></li>
					    <li><a href="#">Clothes</a></li>
					    
					</ul>
				</div>
				
				
			</div>
			<!-- End Categories -->
			
		</div>
		<!-- End Sidebar -->
		
		<div class="cl">&nbsp;</div>
	</div>
	<!-- End Main -->
	

	
	<!-- Footer -->
	<div id="footer">
		<p class="left">
			<a href="#">Home</a>
			<span>|</span>
			<a href="#">Support</a>
			<span>|</span>
			<a href="#">My Account</a>
			<span>|</span>
			<a href="#">The Store</a>
			<span>|</span>
			<a href="#">Contact</a>
		</p>
		<p class="right">
			&copy; 2016 eShop 
		</p>
	</div>
	<!-- End Footer -->
	
</div>	
<!-- End Shell -->
	
	
</body>
</html>