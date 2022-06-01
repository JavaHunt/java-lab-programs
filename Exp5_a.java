// Single Inheritance

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class shape
{
	int len, bd, a;;
	Scanner sc = new Scanner(System.in);
	void area(){
		a = len * bd;
	}
}

class square extends shape
{
	void read(){
		System.out.println("Enter side of a square : ");
		len = sc.nextInt();
		bd = len;
	}
	void display(){
		System.out.println("Area is " + a);
	}
	public static void main(String args[])
	{
		square s = new square();
		s.read();
		s.area();
		s.display();
	}
}

/*
Output :

Enter side of a square :
6
Area is 36

*/