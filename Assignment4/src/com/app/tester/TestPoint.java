package com.app.tester;
import java.util.Scanner;
import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) {
	
         Scanner scn = new Scanner(System.in);
         int p1 = scn.nextInt();
         int p2 = scn.nextInt();
         
 		Point2D p = new Point2D(p1,p2);
 		
 		if(p.isEqual()) {
 			System.out.println("p1 and p2 are located at the same position");
 		} else {
 			System.out.println(p.getDetails());
 			System.out.println(p.calculateDistance());
 			
 		}
 		
	}

}
