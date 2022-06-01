// multi - level inheritance

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Base1
{
	int x;
	Scanner sc = new Scanner(System.in);
	void readx(){
		System.out.print("Enter x value : ");
		x = sc.nextInt();
	}
	void showx(){
		System.out.println("x value : " + x);
	}
}

class Base2 extends Base1
{
	int y;
	void ready(){
		System.out.print("Enter y value : ");
		y = sc.nextInt();
	}
	void showy(){
		System.out.println("y value is : " + y);
	}
}

class Derived extends Base2
{
	int z;
	void readz(){
		readx();
		ready();
		System.out.print("Enter y value : ");
		z = sc.nextInt();
	}
	void showz(){
		showx();
		showy();
		System.out.println("z value is : " + z);
	}
	
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.readz();
		d.showz();
	}
}

/*
Output :

Enter x value : 7
Enter y value : 8
Enter y value : 4
x value : 7
y value is : 8
z value is : 4

*/