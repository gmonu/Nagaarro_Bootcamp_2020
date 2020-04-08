package Self_Searched;
import java.util.*;

public class Stack1 {
	static Scanner sc = new Scanner(System.in);
	static int stack[], top = -1, size, mid;
	static 
	{
		Stack1.create();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<Stack1.size; i++)
		{
			push(Stack1.sc.nextInt());
		}
		//tranverse();
		Stack1.mid = (Stack1.size/2);
		//System.out.println(mid);
		if(Stack1.size == 1)
		{
			System.out.println(Stack1.stack[0]);
		}
		else if(Stack1.size%2 == 0) {
		System.out.println(Stack1.stack[mid-1]);
		}
		else
		{
			System.out.println(Stack1.stack[mid]);		
		}
		
		
	}
	static void create()
	{
		//System.out.println("Enter the size of stack:");
		Stack1.size = Stack1.sc.nextInt();
		Stack1.stack = new int[Stack1.size];
		//System.out.print("Stack created with size:"+Stack1.size);
	}
	static void push(int item)
	{
		if(Stack1.isFull())
		{
			System.out.println("Stack is Overflow \n");
		}
		else
		{
			stack[++top] = item;
		}
	}
	static boolean isFull()
	{
		if(Stack1.top == size-1)
		{
			return true;
	
		}
		else
		{
			return false;
		}
	}
	static void tranverse()
	{
		if(Stack1.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		
		else	
		{
			//System.out.println("Stack elements are:");
		
			for(int i =top; i>=0; i--)
			{
			System.out.print(Stack1.stack[i]);
			}
		}
	}
	static boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static int get(int item)
	{
		if(Stack1.isEmpty())
		{
			return 0;
		}
		else
		{
			for(int i = 0; i<=top; i++)
			{
		
				if(i == item)
				{
					return Stack1.stack[i];
				}
			}
		}
		return 0;
	}

}
