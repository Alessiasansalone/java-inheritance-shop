package org.lessons.java.inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Smartphone samsungPhone = new Smartphone("Galaxy S8", "Samsung");
		System.out.println(samsungPhone.toString());
		
		Smartphone iPhone = new Smartphone("iPhone");
		System.out.println(iPhone.toString());
		
		Smartphone nokia = new Smartphone();
		System.out.println(nokia.toString());	
		
		Smartphone honor = new Smartphone("Magic6 lite", "Honor", "8GB");
		System.out.println(honor.toString());	
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		Television samsungTV = new Television("Hotel TV", "Samnsung");
		System.out.println(samsungTV.toString());
		
		Television geloso = new Television("Televisore Vintage Wood GT1014");
		System.out.println(geloso.toString());
		
		Television philips = new Television();
		System.out.println(philips.toString());
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		Headphones marshall = new Headphones("Major IV", "Marshall");
		System.out.println(marshall.toString());
		
		Headphones beats = new Headphones("Studio3");
		System.out.println(beats.toString());
		
		Headphones sony = new Headphones();
		System.out.println(sony.toString());
	}
}
