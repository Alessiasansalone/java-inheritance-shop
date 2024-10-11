package org.lessons.java.inheritance;

public class Smartphone extends Product {
	
	int codeIMEI;
	String ram;

	protected Smartphone(String name, String brand) {
		super("Galaxy S24", "Samsung");
		this.getCode();
		this.price = 598.99;
		ram = "8GB";
	}
	
	protected Smartphone(String name) {
		super("iPhone X", "Apple");
		this.getCode();
		this.price = 1062.89;
		ram = "3GB";
	}
	
	protected Smartphone() {
		super("3310", "Nokia");
		this.getCode();
		this.price = 95.99;
		ram = "16MB";
	}
	
	protected Smartphone(String name, String brand, String ram) {
		super("Magic6 lite", "Honor");
		this.getCode();
		this.price = 357.89;
		ram = "8GB";
	}

}

