
class Main {

	public static void main (String[] args) {
		
		Triangle theTriangle1 = new Triangle(10.0, 10.0, 10.0);
		double area = theTriangle1.areaOfTriangle();

		System.out.println("The area of the first triangle is " + Functions.areaOfTriangle(10.0, 10.0, 10.0));
		System.out.println("The area of the second triangle is " + Functions.areaOfTriangle(20, 20, 20));
		System.out.println("The area of the third triangle is " + Functions.areaOfTriangle(30, 40, 50));
	}
}