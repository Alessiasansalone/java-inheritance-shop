package org.lessons.java.inheritance;

public class Headphones extends Product{
	
	String color;
	String wireless;
	
	protected Headphones(String name, String brand) {
		super("Major IV", "Marshall");
		this.getCode();
		this.price = 78.00;
		color = "Black";
		wireless = "Yes";
	}
	
	protected Headphones(String name) {
		super("Studio3", "Beats");
		this.getCode();
		this.price = 165.99;
		color = "Rose Gold";
		wireless = "Yes";
	}
	
	protected Headphones() {
		super("MDR-7506", "Sony");
		this.getCode();
		this.price = 58.00;
		color = "White";
		wireless = "No";
	}

}
