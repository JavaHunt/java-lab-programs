// Abstract classes

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
abstract class shapes
{
	float dim1, a;
	Scanner sc = new Scanner(System.in);
	abstract void read();
	abstract void display();
	abstract void area();
}
class square extends shapes
{
	void read(){
		System.out.print("Enter side of a square : ");
		dim1 = sc.nextFloat();
	}
	void area(){
		a = dim1 * dim1;
	}
	void display(){
		System.out.println("Area of square : " + a);
	}
}

class Rectangle extends shapes
{
	float dim2;
	Rectangle(){}
	void read(){
		System.out.print("Enter length and breadth of a Rectangle : ");
		dim1 = sc.nextFloat();
		dim2 = sc.nextFloat();
	}
	void area(){
		a = dim1 * dim2;
	}
	void display(){
		System.out.println("Area of Rectangle : " + a);
	}
}

class Trapezium extends shapes
{
	float dim2, dim3;
	Trapezium(){}
	void read(){
		System.out.print("Enter len1, len2 and height : ");
		dim1 = sc.nextFloat();
		dim2 = sc.nextFloat();
		dim3 = sc.nextFloat();
	}
	void area(){
		a = (dim3*(dim1+dim2))/2;
	}
	void display(){
		System.out.println("Area of Trapezium : " + a);
	}
	
	public static void main(String args[])
	{
		square s = new square();
		Rectangle r = new Rectangle();
		Trapezium t = new Trapezium();
		s.read();
		s.area();
		s.display();

		r.read();		
		r.area();
		r.display();
		
		t.read();
		t.area();
		t.display();
	}
}

/* 
Output :

Enter side of a square : 7
Area of square : 49.0
Enter length and breadth of a Rectangle : 3 5
Area of Rectangle : 15.0
Enter len1, len2 and height : 7 8 3
Area of Trapezium : 22.5

*/