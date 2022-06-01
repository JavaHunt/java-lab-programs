// Write a JAVA program for creation of Java Built-in Exceptions

/* This code is contributed by java_hunt instagram page*/

class Exp9_c
{
	public static void main(String args[])
	{
		String s = null;
		try
		{
			if(s.equals("cse"))
				System.out.println("String s is cse ");
			else
				System.out.println("String s is not cse ");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}

/*
Output :

java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "<local1>" is null
        at Exp9_c.main(Exp9_c.java:12)

*/