package org.lessons.java.inheritance;

public class Main {
	
	public static void main(String[] args) {
		Smartphone samsung = new Smartphone("Galaxy S8", "Samsung");
		System.out.println(samsung.toString());
		
		Smartphone iPhone = new Smartphone("iPhone");
		System.out.println(iPhone.toString());
		
		Smartphone nokia = new Smartphone();
		System.out.println(nokia.toString());	
		
		Smartphone honor = new Smartphone("Magic6 lite", "Honor", "8GB");
		System.out.println(honor.toString());	
	}
}
