public class Circle extends Shape
{
	private double radius;

	public Circle(String string, String string2, double r)
	{ 
		super(string, string2);
		setRadius(r); 
	}

	public double getRadius(){ 
		return radius; 
		}

	public void setRadius(double r){
		radius = r; 
		}

	public double area(){ 
		return Math.PI * Math.pow(radius, 2);
		}

	public String toString() {		
		return ("Radius : " + radius);
	}

	protected String hello() {
		return "Hello";
		}
}