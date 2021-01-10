package entidades;

public class EntidadeTriangulo {

	public double width;
	public double height;
	
	
	public double area() {
		return (width * height)/ 2;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}			
}