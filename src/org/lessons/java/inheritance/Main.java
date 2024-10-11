package org.lessons.java.inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("OUR SMARTPHONES");
		
		Smartphone samsungPhone = new Smartphone("Galaxy S8", "Samsung");
		System.out.println(samsungPhone.toString() + "[IMEI CODE: " 
					+ samsungPhone.codeIMEI + ", RAM: "+ samsungPhone.ram);
		
		Smartphone iPhone = new Smartphone("iPhone");
		System.out.println(iPhone.toString() + "[IMEI CODE: " 
				+ iPhone.codeIMEI + ", RAM: "+ iPhone.ram);
		
		Smartphone nokia = new Smartphone();
		System.out.println(nokia.toString() + "[IMEI CODE: " 
				+ nokia.codeIMEI + ", RAM: "+ nokia.ram);	
		
		Smartphone honor = new Smartphone("Magic6 lite", "Honor", "8GB");
		System.out.println(honor.toString() + "[IMEI CODE: " 
				+ honor.codeIMEI + ", RAM: "+ honor.ram);	
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("OUR TELEVISIONS");
		
		Television samsungTV = new Television("Hotel TV", "Samnsung");
		System.out.println(samsungTV.toString() + ", SMART TV: " + samsungTV.smart 
				+ ", SIZE: " + samsungTV.size);
		
		Television geloso = new Television("Televisore Vintage Wood GT1014");
		System.out.println(geloso.toString() + ", SMART TV: " + geloso.smart 
				+ ", SIZE: " + geloso.size);
		
		Television philips = new Television();
		System.out.println(philips.toString() + ", SMART TV: " + philips.smart 
				+ ", SIZE: " + philips.size);
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("OUR HEADPHONES");
		
		Headphones marshall = new Headphones("Major IV", "Marshall");
		System.out.println(marshall.toString() + ", COLOR: " + marshall.color 
				+ ", WIRELESS: " + marshall.wireless);
		
		Headphones beats = new Headphones("Studio3");
		System.out.println(beats.toString() + ", COLOR: " + beats.color 
				+ ", WIRELESS: " + beats.wireless);
		
		Headphones sony = new Headphones();
		System.out.println(sony.toString() + ", COLOR: " + sony.color 
				+ ", WIRELESS: " + sony.wireless);
	}
}
