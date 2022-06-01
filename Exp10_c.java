// Write a Program illustrating Daemon Threads.

/* This code is contributed by java_hunt instagram page*/


class Exp10_c extends Thread
{
	Exp10_c(String n)
	{
		setName(n);
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName() + " is Daemon thread");
		}
		
		else
		{
			System.out.println(getName() + " is User thread");
		}
	}
	
	public static void main(String[] args)
	{
		Exp10_c t1 = new Exp10_c("Thread1");
		Exp10_c t2 = new Exp10_c("Thread2");
		Exp10_c t3 = new Exp10_c("Thread3");
		t1.setDaemon(true);
			
		t1.start();
		t2.start();
		
		t3.setDaemon(true);
		t3.start();		
	}
}

/*
Output:

Thread1 is Daemon thread
Thread3 is Daemon thread
Thread2 is User thread

*/