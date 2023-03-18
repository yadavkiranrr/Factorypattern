package com.jspider.MobilePateern.Object.Laptop;

import com.jspider.MobilePattern.Builder.LaptopBuilder.Laptopbuilder;
import com.jspider.MobilePattern.Object.Laptop;

public class Laptopmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Laptop laptop=new Laptopbuilder().brand("dell").battery(5000).os("windows")
        		.disp_size(15.6).getLaptop();
           System.out.println(laptop);
	}

}
