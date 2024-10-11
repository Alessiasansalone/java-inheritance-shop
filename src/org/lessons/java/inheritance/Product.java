package org.lessons.java.inheritance;

import java.util.Random;

public class Product {

	private int code;
	protected String name;
	protected String brand;
	protected double price;
	protected double iva;
	
	protected Product (String name, String brand) {
		setCode();
		this.name = name;
		this.brand = brand;
		iva = 0.22;
}
	
	private String setTotalIva() {
		double totalIva = price * iva;
		String rounding = String.format("%.2f", totalIva);
		return rounding;
	}
	
	protected String getTotalIva() {
		return setTotalIva();
	}
	
	private String setTotalPrice() {
		double totalPrice = (price * iva) + price;
		String rounding = String.format("%.2f", totalPrice);
		return rounding;
	}
	
	protected String getTotalPrice() {
		return setTotalPrice();
	}

	@Override
	public String toString() {
		return "CODE: " + code + ", NAME: " + name 
				+ ", BRAND: " + brand + ", costs €" + price 
				+ ". Has a VAT of €" + getTotalIva() + " and a total "
						+ "cost of €" + getTotalPrice();
	}

	private void setCode() {
		Random ran = new Random();
		code = ran.nextInt(99999);
	}
	
	public int getCode() {
		setCode();
		return this.code;
	}
}
