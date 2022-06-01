/* Write a JAVA program that creates threads by extending Thread class .First thread display 
Good Morning every 1 sec, the second thread displays Hello every 2 seconds and the 
third display Welcome every 3 seconds ,(Repeat the same by implementing Runnable)
*/

// This code is contributed by java_hunt instagram page

class Thread1 implements Runnable
{
	Thread1()
	{
		Thread t1 = new Thread(this);
		t1.start();
	}
	public void run()
	{
		try{
			while(true){
				System.out.println("Good Morning");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Thread2 implements Runnable
{
	Thread2()
	{
		Thread t2 = new Thread(this);
		t2.start();
	}
	
	public void run()
	{
		try{
			while(true){
				System.out.println("Hello");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Thread3 implements Runnable
{
	Thread3()
	{
		Thread t3 = new Thread(this);
		t3.start();
	}
	
	public void run()
	{
		try{
			while(true){
				System.out.println("Welcome");
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}


class Exp10_a
{
	public static void main(String[] args)
	{
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		Thread3 obj3 = new Thread3();
	}
}

/*
Output :

Good Morning
Hello
Welcome
Good Morning
Hello
Good Morning
Welcome
Good Morning
Hello
Good Morning
Good Morning
^C

*/