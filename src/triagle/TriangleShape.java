package triagle;
import shape.Shape;

public class TriangleShape extends Shape {

	public TriangleShape(double length, double breadth) {
		super(length, breadth);
	}	
	public TriangleShape(double equilateral_side) {
		// TODO Auto-generated constructor stub
		super(equilateral_side);
	}
	public void compute_area(double side) {
		          Area = ((Math.sqrt(3))*Math.pow(equilateral_side, 2))/4;
				System.out.println("The Area Of Equilateral Triangle is :"+ Area);
	}
	@Override
	
	public void Compute_Area(){
	Area=0.5*length*breadth;
	System.out.println("AREA OF Triangle is :"+ Area);
		}
	}


