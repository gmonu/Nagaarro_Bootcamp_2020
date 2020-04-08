package Self_Searched;
import java.util.Scanner;
import java.util.Arrays;

//change the class name as Queue
public class Sort_Queue {
	
	static Scanner sc = new Scanner(System.in);
	static int queue[], front = 0, rear = 0, size, testcase;

	// static 
	// {

	// 	Queue.create();
		
	// }


	public static void main(String[] args) {
		
		testcase = sc.nextInt();
		for(int i =0; i<testcase; i++)
		{
		//System.out.println("Enter the size of queue:");
		Queue.size = Queue.sc.nextInt();
		Queue.queue = new int[Queue.size];
		//System.out.print("Queue created with size:"+Queue.size);
		

		for(int k =0; k<size; k++)
		{
			nqueue(sc.nextInt());
		}
		Arrays.sort(queue);
		for(int k =0; k<size; k++)
		{
			System.out.print(queue[k]+" ");
		}
		System.out.println();
		for(int k =0; k<size; k++)
		{
			dqueue();
		}
		}
	}
	static void dqueue()
	{
		if(Queue.isEmpty())
		{
			//System.out.println("Queue is Empty(Underflow)");
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

	// static void create()
	// {
	// 	System.out.println("Enter the size of queue:");
	// 	Queue.size = Queue.sc.nextInt();
	// 	Queue.queue = new int[Queue.size];
	// 	System.out.print("Queue created with size:"+Queue.size);
	// }
	static void nqueue(int item)
	{
		if(Queue.isFull())
		{
			//System.out.println("Queue is Overflow(Full) \n");
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

}	