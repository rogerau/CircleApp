
public class Circle {
	
	
	//instance variables
	private double radius;
	private double diameter;
	private double area;
	
	//Instance methods (getter or accessor / setters or mutator)
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		this.diameter = 2*radius;
		this.area = Math.PI * Math.pow(radius, 2);
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//constructor
	public Circle() {
		radius = 1;
		diameter = 2*radius;
		area = Math.PI * Math.pow(radius, 2);
	}
	
	public Circle(double radius) {
		this.radius = radius;
		diameter = 2*radius;
		area = Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		String result = String.format("%.2f", this.radius) + ", " + String.format("%.2f",this.diameter) + ", " + 
						String.format("%.2f",this.area);
		return result;
	}


}
