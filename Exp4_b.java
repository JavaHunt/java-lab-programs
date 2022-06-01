// method overloading

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Exp4_b
{
	void area(double s)
	{
		System.out.println("\nArea of a square : " + s*s);
	}
	
	void area(double l, double b)
	{
		System.out.println("\nArea of a rectangle : " + l*b);
	}
	
	public static void main(String args[])
	{
		double s, l, b;
		Exp4_b obj = new Exp4_b();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of a square : ");
		s = sc.nextDouble();
		obj.area(s);
		System.out.print("Enter length and breadth of a rectangle : ");
		l = sc.nextDouble();
		b = sc.nextDouble();
		obj.area(l, b);
	}
}

/*
Output :

Enter side of a square : 5

Area of a square : 25.0

Enter length and breadth of a rectangle : 7 4

Area of a rectangle : 28.0

*/