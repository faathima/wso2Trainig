package com.axis2;

public class Entry {
	private String name=null;
	private double price;
	private String madeIn=null;
	
	//set entry data
	public void	 setName(String name) {
		this.name=name;
	}
	
	public void	 setPrice(double price) {
		this.price=price;
	}
	
	public void	 setMadeIn(String madeIn) {
		this.madeIn=madeIn;
	}
	
	//get entry data
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public String getMadeIn() {
		return madeIn;
	}

}
