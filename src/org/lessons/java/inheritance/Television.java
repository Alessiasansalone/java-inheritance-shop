package org.lessons.java.inheritance;

public class Television extends Product{
	
	String smart;
	String size;

	protected Television(String name, String brand) {
		super("Hotel TV", "Samsung");
		this.getCode();
		this.price = 600.00;
		smart = "Yes";
		size = "50\"";
	}
	
	protected Television(String name) {
		super("Televisore Vintage Wood GT1014", "Geloso");
		this.getCode();
		this.price = 1670.00;
		smart = "No";
		size = "30\"";
	}
	
	protected Television() {
		super("TV LED", "Philips");
		this.getCode();
		this.price = 258.99;
		smart = "Yes";
		size = "40\"";
	}

}
