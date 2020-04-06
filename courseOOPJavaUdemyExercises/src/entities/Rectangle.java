package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double rectangleArea() {
		return width * height;
	}
	public double rectanglePerimeter() {
		return (width + height) * 2;
	}
	public double rectangleDiagonal() {
		return Math.pow(width, 2)+Math.pow(height, 2);
	}
	public String toString() {
		return "AREA = " + String.format("%.2f", rectangleArea()) + "\n"
				+ "PERIMETER = " + String.format("%.2f", rectanglePerimeter()) + "\n"
				+ "DIAGONAL = " + String.format("%.2f", rectangleDiagonal());
	}
}
