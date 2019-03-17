package com.katerina.CircleProject;


public class Circle{
	Point center;
	Circumference circumference;
	
	public Circle(Point center, float radius){
		this.center = center;
		this.circumference = new Circumference(radius);
	}
	
	public void setSize(float size){
		this.circumference.setRadius((float)(size / (2 * Math.PI)));
	}
	
	public void setRadius(float radius){
		this.circumference.setRadius(radius);
	} 
	
	public void isPointInCircle(Point point){
		float distance = (float)(Math.pow(this.center.getAxisX() - point.getAxisX(), 2) + Math.pow(this.center.getAxisY() - point.getAxisY(), 2));
		if (distance <= this.circumference.getRadius()){
			System.out.println("Point " + point.toString() + " is in circle");
		} else {
			System.out.println("Point " + point.toString() + " is not in circle");
		}
	} 
	
	public String toString(){
		return "Circle:\n" + "Center: " + this.center + " Radius: " + this.circumference.getRadius();
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public boolean equals(Circle obj){
		return this.hashCode() == obj.hashCode();
	}
	
}