package rectangle;
import shape.Shape;
public class Rectangle extends Shape {
 public Rectangle(double length,double breadth){
	 super(length,breadth);
 }
	@Override
	public void Compute_Area(){
	Area=length*breadth;
	System.out.println("AREA OF Rectangle is :"+ Area);
		}
}
