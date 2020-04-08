package Self_Searched;
import java.util.Scanner;
import java.util.Arrays;


class Reverse_Queue {
	
	static Scanner sc = new Scanner(System.in);
	static int queue[], front = 0, rear = 0, size;

	


	public static void main(String[] args) {
		
		
		//System.out.println("Enter the size of queue:");
		Reverse_Queue.size = Reverse_Queue.sc.nextInt();
		Reverse_Queue.queue = new int[Reverse_Queue.size];
		
		//System.out.print("Queue created with size:"+Queue.size);
		

		for(int k =0; k<size; k++)
		{
			nqueue(sc.nextInt());
		}
		
		
		traverse();
		
		}
	
	static void traverse()
	{
		if(Reverse_Queue.isEmpty())
		{
			System.out.println("Reverse_Queue is Underflow(Empty)");
		}
		else
		{
			for(int i =rear-1; i>=0; i--)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.print("END\n");
		}
	}
	static void dqueue()
	{
		if(Reverse_Queue.isEmpty())
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

	static void nqueue(int item)
	{
		if(Reverse_Queue.isFull())
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
		if(Reverse_Queue.rear == size)
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