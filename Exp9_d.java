// Write a JAVA program for creation of User Defined Exception 

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

class Exp9_d
{
	public static void main(String[] args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		age = sc.nextInt();
		try
		{
			if(age < 18)
				throw new MyException("You are not eligible to vote");
			else
				System.out.println("You are eligible to vote");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

/*
Output :

Enter your age : 16
You are not eligible to vote

*/