// Write a JAVA program for creation of Illustrating finally

/* This code is contributed by java_hunt instagram page*/

// Copying array elements to another array

import java.util.Scanner;
class Exp9_b
{
	public static void main(String[] args)
	{
		int n1, n2, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array 1 size : ");
		n1 = sc.nextInt();
		System.out.print("Enter array 2 size : ");
		n2 = sc.nextInt();
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		System.out.println("Enter array 1 elements : ");
		try{
			for(i = 0; i < n1; i++)
			{
				a1[i] = sc.nextInt();
				a2[i] = a1[i];
			}
			System.out.println("Elements copied successfully");
			System.out.println("Copied elements are : ");
			for(i = 0; i < n2; i++)
				System.out.println(a2[i]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("End of the program ");
		}
	}
}

/*
Output :

Enter array 1 size : 5
Enter array 2 size : 4
Enter array 1 elements :
3 4 2 5 7
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at Exp9_b.main(Exp9_b.java:25)
End of the program

*/