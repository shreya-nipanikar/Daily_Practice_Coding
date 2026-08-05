package com.corejava.java8features;


public class EcommerceStream {
    
	int productPrice;
	int stockQuantity;
	public EcommerceStream(int productPrice, int stockQuantity) {
		this.productPrice = productPrice;
		this.stockQuantity = stockQuantity;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	@Override
	public String toString() {
		return "EcommerceStream [productPrice=" + productPrice + ", stockQuantity=" + stockQuantity + "]";
	}
	
	
	
}
