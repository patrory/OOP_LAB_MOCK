package main;
import shape.Shape;
import triagle.TriangleShape;
import rectangle.*;
import java.util.*;
public class MainArea {

	public static void main(String[] args) {
		double val = 0;
		double y=0;
		boolean loop = true;
		while(loop) {
			System.out.println("1 for Equlateral   2 for Triangle    3 for Rectangle  4 to exit");
			int x;
			Scanner sc = new Scanner(System.in);
			x=sc.nextInt();
			if(x==1) {
				System.out.println("Enter the measure of 1 side of Triangle");
				val= sc.nextDouble();
				TriangleShape t2= new TriangleShape(val);
				t2.compute_area(val);
			}
			if(x==2) {
				System.out.println("Enter the measure of 2 side of Triangle");
				System.out.print("base : " );
				val=sc.nextDouble();
				//System.out.println(" ");
				System.out.print("height : ");
				y=sc.nextDouble();
				TriangleShape t3= new TriangleShape(val,y);
				t3.Compute_Area();
				}
			if(x==3) {
				System.out.println("Enter length and Breadth");
				System.out.print("Length : " );
				val=sc.nextDouble();
				//System.out.println(" ");
				System.out.print("Beadth : ");
				y=sc.nextDouble();
				Rectangle t4=new Rectangle(val,y);
				t4.Compute_Area();
				
			}
			if(x==4) {
				loop=false;
			}
			//sc.close();
			
		}
	}

}
