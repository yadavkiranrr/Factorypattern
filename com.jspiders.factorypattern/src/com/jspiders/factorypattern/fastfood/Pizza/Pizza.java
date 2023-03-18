package com.jspiders.factorypattern.fastfood.Pizza;

import com.jspiders.factorypattern.fastfood.Fastfoods;

public class Pizza implements Fastfoods{
	
	@Override
	public void nowOrdering() {
		System.out.println("now ordering Pizza");
	}

}
