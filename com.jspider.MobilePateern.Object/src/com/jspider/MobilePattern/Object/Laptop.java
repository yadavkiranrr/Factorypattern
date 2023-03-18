package com.jspider.MobilePattern.Object;

public class Laptop {
	private String brand;
	private String processor;
	private String color;
	private double price;
	private int ram;
	private int ssd;
	private String os;
	private int graphic;
	private int battery;
	private double disp_size;
	
	public Laptop(String brand ,String processor, String color,double price,
			int  ram, int ssd, String os, int graphic, int battery, 
			double disp_size) {
		super();
		this.brand=brand;
		this.processor=processor;
		this.color=color;
		this.price=price;
		this.ram=ram;
		this.ssd=ssd;
		this.os=os;
		this.graphic=graphic;
		this.battery=battery;
		this.disp_size=disp_size;
		
	}
	@Override
	public String toString() {
		return"Laptop [brand="+brand+",processor="+processor+",ram="+ram+",ssd="+ssd+",os="+os+",graphic="+graphic+",battery="+battery+
				",disp_size="+disp_size+"]";
	}
	

}
