package j0525;

public class Circle {
	double radius;
	final double pi=3.14;
	
	Circle(){};
	Circle(double radius){
		this.radius=radius;
	}
	
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	double computeArea() {
		return pi*radius*radius;
	}
	double computePerimeter() {
		return 2*pi*radius;
	}
	
}
