// program to find qualifying racers

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Exp1_c
{
	public static void race()
	{
		int i;
		double avg, sum=0;
		float a[] = new float[5];
		Scanner sc = new Scanner(System.in);
		for(i=0; i < a.length; i++)
		{
			System.out.print("Enter speed of racer " + (i+1) + " : ");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		avg = sum/a.length;
		System.out.println("Average speed of 5 racers : " + avg);
		for(i=0; i < a.length; i++)
		{
			if(a[i] > avg)
			{
				System.out.println("Racer " + (i+1) + " is qualified with speed : " + a[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		race();
	}
}

/* 
Output :

Enter speed of racer 1 : 23
Enter speed of racer 2 : 43
Enter speed of racer 3 : 36
Enter speed of racer 4 : 42
Enter speed of racer 5 : 28
Average speed of 5 racers : 34.4
Racer 2 is qualified with speed : 43.0
Racer 3 is qualified with speed : 36.0
Racer 4 is qualified with speed : 42.0

*/