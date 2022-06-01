// Binary search

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;
class Exp2_a
{
	private static int BinarySearch(int a[], int key, int low, int high)
	{
		int mid;
		mid = (low + high) / 2;
		if (high >= low)   // To check element is present in array or not
		{
			if (a[mid] == key)
				return mid;
			else if(key > a[mid])
				return BinarySearch(a, key, mid+1, high);
			else
				return BinarySearch(a, key, low, mid-1);
		}
		return 0;
	}
	public static void main(String args[])
	{
		int n, i, x, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter " + n + " elements in sorted order : ");
		for(i=0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter element to search : ");
		k = sc.nextInt();
		sc.close();
		x = BinarySearch(a, k, 0, n-1);
		if(x != 0)
		{
			System.out.print("Element found at position : " + (x+1));
		}
		else
			System.out.println("Element not found");
	}
}

/* 
Output : 

Enter size of array : 6
Enter 6 elements in sorted order : 2 3 6 8 9 32
Enter element to search : 9
Element found at position : 5

*/