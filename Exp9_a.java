// Write a JAVA program for creation of Illustrating throw 

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Exp9_a
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive even number : ");
		n = sc.nextInt();
		try
		{
			if(n > 0){
				if(n % 2 == 0)
					System.out.println(n + " is valid positive even number ");
				else
					throw new ArithmeticException(n + " is positive odd number ");
			}
			else
				throw new ArithmeticException(n + " is negative ");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}

/*
Output :

Enter a positive even number : 7
java.lang.ArithmeticException: 7 is positive odd number

*/
