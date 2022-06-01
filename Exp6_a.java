// EXP6 a

/* This code is contributed by java_hunt instagram page*/


import java.util.Scanner;
class Base
{
	Scanner sc = new Scanner(System.in);
	int x;
}

class Derived extends Base
{
	int x;
	void read(){
		System.out.print("Enter super class x : ");
		super.x = sc.nextInt();
		System.out.print("Enter derived class x : ");
		x = sc.nextInt();
	}
	void display(){
		System.out.println("Super class x = " + super.x);
		System.out.println("Derived class x = " + x);
	}
}

class Exp6_a
{
	public static void main(String args[])
	{
		Derived obj = new Derived();
		obj.read();
		obj.display();
	}
}

/* 
Output :

Enter super class x : 7
Enter derived class x : 2
Super class x = 7
Derived class x = 2

*/