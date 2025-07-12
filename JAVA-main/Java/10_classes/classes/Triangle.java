package classes;


public class Triangle {
	int base, height;


	public Triangle() {
		super();
	}
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void setTriangle(int b, int h) {
		this.base = b;
		this.height = h;
		
	}
	double getArea() {
		return base*height/2;
	}
	
	
	


	

}
