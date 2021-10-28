package shape;
public class Shape {
	protected double length;  // triagle's base
	protected double breadth; // triangle's height
	protected double equilateral_side;
	protected double Area;
	Shape(){
		System.out.println("Default Constructor");
	}
	protected Shape(double equilateral_side){
		//Area = ((Math.sqrt(3))*Math.pow(equilateral_side, 2))/4;
		//System.out.println("The Area Of Shape is :"+ Area);
		this.equilateral_side=equilateral_side;
	}
	protected Shape(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	protected  void Compute_Area() {
		System.out.println("Default Area");
	};
	
}
