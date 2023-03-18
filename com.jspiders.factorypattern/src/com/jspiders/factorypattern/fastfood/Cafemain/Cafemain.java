package com.jspiders.factorypattern.fastfood.Cafemain;

import java.util.Scanner;
import com.jspiders.factorypattern.fastfood.Burger.*;
import com.jspiders.factorypattern.fastfood.Coldcoffee.*;
import com.jspiders.factorypattern.fastfood.Fries.*;
import com.jspiders.factorypattern.fastfood.Pasta.*;
import com.jspiders.factorypattern.fastfood.Pizza.*;
import com.jspiders.factorypattern.fastfood.Fastfoods;

public class Cafemain {
 static  boolean Loop=true;
 static Fastfoods fastfoods;
 public static void main(String[] args) {
	 while(Loop) {
		 try{
			 fastfoodsFactory().nowOrdering();
		 }
		 catch(NullPointerException e) {
			 System.out.println("no order selected");
		}                                        
    }
 }
	 
 
	 public static Fastfoods fastfoodsFactory() {
		 System.out.println("Select a Fastfood to eat:n"+"1.Burger \n"+"2.Pasta \n"
	 +"3.Coldcoffee \n"+"4.Fries \n"+"5.Pizza");
	 
		 
		 Scanner scanner=new Scanner(System.in);
		 int choice = scanner.nextInt();
		 scanner .close();
		 
		 switch(choice) {
		 case 1:{
			 fastfoods = new Burger();
			 Loop=false;
			 return fastfoods;
		 }
			 
		 case 2:{
			 fastfoods = new Pasta();
			 Loop=false;
			 return fastfoods;
		 }
		 case 3:{
			 fastfoods = new Coldcoffee();
			 Loop=false;
			 return fastfoods;
		 }
		 case 4:{
			 fastfoods = new Fries();
			 Loop=false;
			 return fastfoods;
		 }
		 case 5:{
			 fastfoods = new Pizza();
			 Loop=false;
			 return fastfoods;
		 }
			 
			default:
			System.out.println("Invalid Choice");
			Loop=false;
			return fastfoods;
			
		 }
	 }
}
		 
        

   
 
	 



