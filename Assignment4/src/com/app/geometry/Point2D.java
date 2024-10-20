package com.app.geometry;

public class Point2D{
	int x;
	
	int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails()
	{
		return "{" + x + "," + y + "}";
	}
	
	public boolean isEqual() {
		if(x == y){
			return true;
		} else {
			return false;
		}
	}
	
	public double calculateDistance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
	}
}
	 
