// Constructor overloading

/* This code is contributed by java_hunt instagram page*/

class Exp4_a
{
	Exp4_a(int n1, int n2)
	{
		int n3 = n1 + n2;
		System.out.println("Sum of 2 integers : " + n3);
	}
	
	Exp4_a(double n1, double n2)
	{
		double n3 = n1 + n2;
		System.out.println("Sum of 2 floating numbers : " + n3);
	}
	
	public static void main(String args[])
	{
		Exp4_a obj1 = new Exp4_a(2, 3);
		Exp4_a obj2 = new Exp4_a(2.5, 3.2);
	}
}		

/*
Output : 

Sum of 2 integers : 5
Sum of 2 floating numbers : 5.7

*/