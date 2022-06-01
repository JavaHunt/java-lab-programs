// Write a program illustrating isAlive and join ()

/* This code is contributed by java_hunt instagram page*/

class Exp10_b implements Runnable
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Exp10_b(), "T1");
		Thread t2 = new Thread(new Exp10_b(), "T2");
		t1.start();
		t2.start();
		try{
			if(t1.isAlive()){
				System.out.println("t1 is alive");
				t2.join();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		
		for(int i=1; i <= 5; i++)
			System.out.print(Thread.currentThread().getName() + " : " + i + "\t");
		System.out.println();
	}
}

/*
Output :

t1 is alive
T2 : 1  T2 : 2  T2 : 3  T2 : 4  T2 : 5
T1 : 1  T1 : 2  T1 : 3  T1 : 4  T1 : 5

*/