package Self_Searched;
import java.util.*;

public class Stack2 {
	static Scanner sc = new Scanner(System.in);
	static int stack[], top = -1, size, arr[], N, brr[];
	static 
	{
		Stack2.create();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i = 0; i<Stack2.size; i++)
		{
			push(Stack2.sc.nextInt());
		}
		int a = Stack2.pop();
		for(int i =0; i<Stack2.size; i++)
		{
			arr[i] = Stack2.stack[i];
		}
		for(int i = 0; i<Stack2.size; i++)
		{
			push(Stack2.sc.nextInt());
		}
		int b = Stack2.pop();
		for(int i =0; i<Stack2.size; i++)
		{
			brr[i] = Stack2.stack[i];
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("Elements in stack1 are:");
	
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Elements in stack2 are:");
		for(int i =0; i<brr.length; i++)
		{
			System.out.print(brr[i]+" ");
		}
		
		//tranverse();
		
		
		
	}
	static void create()
	{
		System.out.println("Enter N");
		N = sc.nextInt();
		Stack2.arr = new int[N];
		Stack2.brr = new int[N];
		System.out.println("Enter the size of stack:");
		Stack2.size = Stack2.sc.nextInt();
		Stack2.stack = new int[Stack2.size];
		System.out.print("Stack created with size:"+Stack2.size);
	}
	static void push(int item)
	{
		if(Stack2.isFull())
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
		if(Stack2.top == size-1)
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
		if(Stack2.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		
		else	
		{
			System.out.println("Stack elements are:");
		
			for(int i =top; i>=0; i--)
			{
			System.out.print(Stack2.stack[i]);
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
		if(Stack2.isEmpty())
		{
			return 0;
		}
		else
		{
			for(int i = 0; i<=top; i++)
			{
				System.out.println(Stack2.stack[i]);
			}
		}
		return 0;
	}
	static int pop()
	{
		if(Stack2.isEmpty())
		{
			return 0;
		}
		else
		{
			return Stack2.stack[top--];
		}
	}

}
