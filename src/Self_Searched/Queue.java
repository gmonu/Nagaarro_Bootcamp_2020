package Self_Searched;

import java.util.Scanner;
import java.util.Arrays;


public class Queue {
	
	static Scanner sc = new Scanner(System.in);
	static int queue[], front = 0, rear = 0, size;
	static 
	{
		Queue.create();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch, item;
		while(true)
	
		{
			System.out.println("1. Nqueue");
			System.out.println("2. Dqueue");
			System.out.println("3. First and Last element of Queue");
			System.out.println("4. Traverse");
			System.out.println("5. Sort");
			System.out.println("6. Exit");
			System.out.print("Enter your choice");
			ch = Queue.sc.nextInt();
	
			switch(ch)
			{
				case 1:
						System.out.println("Enter the element");
						item = Queue.sc.nextInt();
						nqueue(item);
						break;
				case 2:
						System.out.println("Dequeued item is:"+queue[front]);
						Queue.dqueue();
						break;
				case 3:
					   Queue.first_last();
					break;
				case 4:
						Queue.traverse();
						break;
				case 5:
						Arrays.sort(Queue.queue);
						break;
				case 6:	
						System.exit(1);
				default :	
						System.out.println("Invalid Input \n");
			}
		}

	}
	
	static void create()
	{
		System.out.println("Enter the size of queue:");
		Queue.size = Queue.sc.nextInt();
		Queue.queue = new int[Queue.size];
		System.out.print("Queue created with size:"+Queue.size);
	}
	static void nqueue(int item)
	{
		if(Queue.isFull())
		{
			System.out.println("Queue is Overflow(Full) \n");
		}
		else
		{
			queue[rear] = item;
			rear++;
		}
	}
	static boolean isFull()
	{
		if(Queue.rear == size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static void dqueue()
	{
		if(Queue.isEmpty())
		{
			System.out.println("Queue is Empty(Underflow)");
		}
		else
		{
			for(int i =0; i<rear-1; i++)
			{
				queue[i] = queue[i+1];
			}
			rear--;
			
			
		}
	}
	static void first_last()
	{
		if(Queue.isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("First element of Queue is :"+queue[front]);
			System.out.println("Last element of Queue is :"+queue[rear-1]);
		}
	}
	static void traverse()
	{
		if(Queue.isEmpty())
		{
			System.out.println("Queue is Underflow(Empty)");
		}
		else
		{
			for(int i =0; i<rear; i++)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.print(" END\n");
		}
	}
	static boolean isEmpty()
	{
		if(rear==front)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}
	
//	static void sort1()
//	{
//		int temp;
//		for(int i =front; i<size-2; i++)
//		{
//			for(int j =i+1; j<size-1; j++)
//			{
//				if(queue[i]<=queue[j])
//				{
//					temp = queue[i];
//					queue[i] = queue[j];
//					queue[j] = temp;
//				}
//			}
//		}
//	}

}
