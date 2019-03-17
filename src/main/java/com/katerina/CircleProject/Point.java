package com.katerina.CircleProject;


public class Point{
	private float axisX;
	private float axisY;
	
	public Point(float axisX, float axisY){
		this.axisX = axisX;
		this.axisY = axisY;
	}
	
	public float getAxisX(){
		return this.axisX;
	}
	
	public float getAxisY(){
		return this.axisY;
	}
	
	public String toString(){
		return "[" + this.axisX + "; " + this.axisY + "]";
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public boolean equals(Point obj){
		return this.hashCode() == obj.hashCode();
	}
}