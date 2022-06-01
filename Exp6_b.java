/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
interface perimeter
{
	void perimeter();
}
interface area
{
	void area();
}

class Rectangle implements area, perimeter
{
	int res1, res2, dim1, dim2;
	void read(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth : ");
		dim1 = sc.nextInt();
		dim2 = sc.nextInt();
	}
	public void perimeter(){
		res1 = 2 * (dim1 + dim2);
		System.out.println("Perimeter= "+res1);
	}
	public void area(){
		res2 = dim1 * dim2;
		System.out.println("Area = " + res2);
	}
}

class Exp6_b
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		obj.read();
		obj.perimeter();
		obj.area();
	}
}

/*
Output : 

Enter length and breadth : 4 6
Perimeter= 20
Area = 24

*/