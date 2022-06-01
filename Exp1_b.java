// Java program to calculate roots of qudratic equation

/* This code is contributed by java_hunt instagram page*/


import java.util.Scanner;
class Exp1_b
{
	public static void main(String args[])
	{
		int a, b, c, d;
		double r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x2 coefficient : ");
		a = sc.nextInt();
		System.out.print("Enter x coefficient : ");
		b = sc.nextInt();
		System.out.print("Enter constant : ");
		c = sc.nextInt();
		d = (b*b) - 4*a*c;
		System.out.println("\nDiscriminant : " + d);
		r1 = (-1 * b + Math.sqrt(d))/(2*a);
		r2 = (-1 * b - Math.sqrt(d))/(2*a);
		System.out.println("Root 1 : " + r1);
		System.out.println("Root 2 : " + r2);
		if(d > 0)
			System.out.println("Roots are real and distint");
		else if(d == 0)
			System.out.println("Roots are real and equal");
		else if(d < 0)
			System.out.println("Roots are complex");
	}
}

/*
Output : 

Enter x2 coefficient : 1
Enter x coefficient : -5
Enter constant : 6

Discriminant : 1
Root 1 : 3.0
Root 2 : 2.0
Roots are real and distint

*/