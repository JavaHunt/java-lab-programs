// Write a JAVA program that describes exception handling mechanism

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Exp7_a
{
	public static void  main(String args[])
	{
		int dividend, divisor, res;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend : ");
		dividend = sc.nextInt();
		System.out.print("Enter divisor : ");
		divisor = sc.nextInt();
		try{
			res = dividend / divisor;
			System.out.println("Division : " + res);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}


/*
Output :

Enter dividend : 3
Enter divisor : 0
java.lang.ArithmeticException: / by zero
        at Exp7_a.main(Exp7_a.java:15)
		
*/