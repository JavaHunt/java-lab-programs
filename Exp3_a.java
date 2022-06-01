// To create a class and methods, invoke them in main method 

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Exp3_a
{
	int num, rev = 0;
	Scanner sc = new Scanner(System.in);
	void read()
	{
		System.out.print("Enter a number : ");
		num = sc.nextInt();
	}
	
	void reverse()
	{
		int temp, rem;
		while(num != 0)
		{
			rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
	}
	
	void display()
	{
		System.out.println("\nReverse of number : " + rev);
	}
	
	public static void main(String args[])
	{
		Exp3_a obj = new Exp3_a();
		obj.read();
		obj.reverse();
		obj.display();
	}
}

/*
Output :

Enter a number : 6538

Reverse of number : 8356

*/