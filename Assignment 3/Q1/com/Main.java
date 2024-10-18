package com;


public class Main {
	
	public static void main(String[] args) {
		
		Invoice I = new Invoice("10","bolt",3,100);
		if(I.quantity < 0) {
			I.setquantity(0);
		}
		if(I.price < 0.0) {
			I.setprice(0);
		}
		Double Amount = I.quantity * I.price;
			System.out.println(Amount);
		
}


}
