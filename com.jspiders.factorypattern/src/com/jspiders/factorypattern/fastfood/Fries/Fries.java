package com.jspiders.factorypattern.fastfood.Fries;

import com.jspiders.factorypattern.fastfood.Fastfoods;

public class Fries implements Fastfoods {
	@Override
	public void nowOrdering() {
		System.out.println("Now ordering Fries");
	}

}
