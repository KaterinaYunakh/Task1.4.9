package com.katerina.CircleProject;


public class Circumference{
	private float radius;
	
	public Circumference(float radius){
		this.radius = radius;
	}
	
	public void setRadius(float radius){
		this.radius = radius;
	}
	
	public float getRadius(){
		return this.radius;
	}
	
	public String toString(){
		return "Radius: " + Float.toString(this.radius);
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public boolean equals(Circumference obj){
		return this.hashCode() == obj.hashCode();
	}
}