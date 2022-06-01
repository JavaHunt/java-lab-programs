// Write a JAVA program Producer Consumer Problem

/* This code is contributed by java_hunt instagram page*/

import java.util.*;

class Threadexample {
	public static void main(String[] args) throws InterruptedException
	{
		// Object of a class that has both produce()
		// and consume() methods
		PC pc = new PC();
		System.out.println("Enter maximum capacity : ");
		pc.capacity = pc.sc.nextInt();

		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();
	}


	public static class PC {

		int capacity;
		static int size = 0;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		// Items produced and consumed
		int pamt, camt;

		// Function called by producer thread
		public void produce() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{
					// producer thread waits while list
					// is full
					while (size == capacity)
						wait();
					
					// Number of items producer produced
					pamt = ran.nextInt(capacity-size);
					
					// Increased size by items
					size += pamt;
					System.out.println("Producer produced : " + pamt
									+ "\t Size = " + size);


					// notifies the consumer thread that
					// now it can start consuming
					notify();

					// makes the working of program easier
					// to understand
					Thread.sleep(1000);
				}
			}
		}

		// Function called by consumer thread
		public void consume() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{
					// consumer thread waits while list
					// is empty
					while (size == 0)
						wait();

					// Number of items consumer consumed
					camt = ran.nextInt(size);
					
					if(camt < size){
						// Decreased size by items
						size -= camt;

						System.out.println("Consumer consumed : " + camt
										+ "\t Size = " + size);
						
						
						// Wake up producer thread
						notify();

						// and sleep
						Thread.sleep(1000);
					}
				}
			}
		}
	}
}

/*
Output :

Enter maximum capacity :
8
Producer produced : 4  Size = 4
Producer produced : 0  Size = 4
Consumer consumed : 1  Size = 3
Consumer consumed : 2  Size = 1
Consumer consumed : 0  Size = 1
Producer produced : 5  Size = 6
Producer produced : 0  Size = 6
Consumer consumed : 5  Size = 1
Consumer consumed : 0  Size = 1
Producer produced : 1  Size = 2
Consumer consumed : 1  Size = 1
Consumer consumed : 0  Size = 1
Producer produced : 5  Size = 6
Consumer consumed : 1  Size = 5
Consumer consumed : 4  Size = 1
Producer produced : 3  Size = 4

*/