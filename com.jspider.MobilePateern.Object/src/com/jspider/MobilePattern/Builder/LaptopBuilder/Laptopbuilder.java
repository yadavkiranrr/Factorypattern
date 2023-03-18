package com.jspider.MobilePattern.Builder.LaptopBuilder;

import com.jspider.MobilePattern.Object.Laptop;

public class Laptopbuilder {
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
	
	public Laptopbuilder brand (String brand) {
		this.brand =brand;
		return this;
	}
	public Laptopbuilder processor(String processor) {
		this.processor=processor;
		return this;
	}
	public Laptopbuilder color(String color) {
		this.color=color;
		return this;
	}
	public Laptopbuilder price(double price) {
		this.price=price;
		return this;
	}
	public Laptopbuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	public Laptopbuilder ssd(int ssd) {
		this.ssd=ssd;
		return this;
	}
	public Laptopbuilder graphic(int graphic) {
		this.graphic=graphic;
		return this;
	}
	public Laptopbuilder battery(int battery) {
		this.battery=battery;
		return this;
	}
	public Laptopbuilder disp_size(double disp_size) {
		this.disp_size=disp_size;
		return this;
				
	}
	public Laptopbuilder os(String os) {
		this.os=os;
		return this;
	}
	
	public Laptop getLaptop() {
		Laptop laptop= new Laptop(this.brand,this.processor,this.color,this.price,
				this.ram,this.ssd,this.os,this.graphic,this.battery,this.disp_size);
		return laptop;
		
	}
}
