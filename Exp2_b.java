// Bubble Sort

/* This code is contributed by java_hunt instagram page*/

import java.util.Scanner;

class Exp2_b
{
	private static void BubbleSort(int a[], int n)
	{
		int i, j, temp;
		for(i = 0; i < n-1; i++)
			for(j = 0; j < n-i-1; j++)
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		
		// Displaying elemets
		System.out.println("Elements in Sorted order : ");
		for(i = 0; i < n; i++)
			System.out.print(a[i] + "\t");
	}
	public static void main(String args[])
	{
		int n, i;
		System.out.print("Enter size of array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		BubbleSort(arr, n);
	}
}

/*
Output : 

Enter size of array : 5
Enter elements :
4 2 9 0 3
Elements in Sorted order :
0       2       3       4       9

*/