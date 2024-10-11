package org.lessons.java.inheritance;

public class Smartphone extends Product {
	
	String codeIMEI;
	String ram;

	protected Smartphone(String name, String brand) {
		super("Galaxy S24", "Samsung");
		this.getCode();
		this.price = 598.99;
		codeIMEI = "562957501528472";
		ram = "8GB";
	}
	
	protected Smartphone(String name) {
		super("iPhone X", "Apple");
		this.getCode();
		this.price = 1062.89;
		codeIMEI = "729562846108765";
		ram = "3GB";
	}
	
	protected Smartphone() {
		super("3310", "Nokia");
		this.getCode();
		this.price = 95.99;
		codeIMEI = "013275639877246";
		ram = "16MB";
	}
	
	protected Smartphone(String name, String brand, String ram) {
		super("Magic6 lite", "Honor");
		this.getCode();
		this.price = 357.89;
		codeIMEI = "285927385929175";
		this.ram = "8GB";
	}

}

