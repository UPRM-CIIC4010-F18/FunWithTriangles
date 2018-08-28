
public class Triangle {

	public double side1;
	public double side2;
	public double side3;
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double areaOfTriangle() {
		double s = (this.side1 + this.side2 + this.side3) / 2.0;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;
	}
}
