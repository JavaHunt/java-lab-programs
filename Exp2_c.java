/* Java program for Merge Sort */

/* This code is contributed by java_hunt instagram page*/


import java.util.Scanner;
class MergeSort
{
	void merge(int arr[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int [n1];
		int R[] = new int [n2];

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			merge(arr, l, m, r);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[], n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}

/*
Output :

Enter array size : 5
Enter elements :
4 9 21 6 3
Given Array
4 9 21 6 3

Sorted array
3 4 6 9 21

*/