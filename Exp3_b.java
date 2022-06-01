// To create a class constructor

/* This code is contributed by java_hunt instagram page*/
 
import java.util.Scanner;
class Exp3_b
{
	int num, rev;
	Scanner sc = new Scanner(System.in);
	void read()
	{
		System.out.print("Enter a number : ");
		num = sc.nextInt();
	}
	
	Exp3_b()
	{
		rev = 0;
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
		Exp3_b obj = new Exp3_b();
		obj.read();
		obj.reverse();
		obj.display();
	}
}

/*
Output :

Enter a number : 742

Reverse of number : 247

*/