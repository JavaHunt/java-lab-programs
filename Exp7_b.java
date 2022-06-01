// Write a JAVA program Illustrating Multiple catch clauses
/* This code is contributed by java_hunt instagram page*/

class Exp7_b
{
	public static void main(String[] args)
	{
		int a[] = {2, 6, 8, 3, 5};
		int x = 7, y = 0, i;
		try{
			System.out.println("array elements : ");
			for(i = 0; i <= 5; i++)
				System.out.println(a[i]);
			System.out.println("Division = " + x/y);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		catch(ArithmeticException f)
		{
			f.printStackTrace();
		}
	}
}

/* 
Output :

array elements :
2
6
8
3
5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at Exp7_b.main(Exp7_b.java:12)
		
*/