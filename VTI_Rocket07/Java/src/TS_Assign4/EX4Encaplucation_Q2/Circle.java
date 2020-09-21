package TS_Assign4.EX4Encaplucation_Q2;

public class Circle {
	double radius;
	String color;

	Circle(){
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius, String color){
		this.radius= radius;
		this.color=color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Color: " + this.color + " - radius: " + this.radius;
	}
}
