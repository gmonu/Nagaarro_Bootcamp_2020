package Self_Searched;
import java.util.Scanner;

public class Stack {

	static Scanner sc = new Scanner(System.in);
	static int stack[], top = -1, size;
	
	static 
	{
		Stack.create();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch, item;
		while(true)
	
		{
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Traverse");
			System.out.println("5. Exit");
			System.out.print("Enter your choice");
			ch = Stack.sc.nextInt();
	
			switch(ch)
			{
				case 1:
						System.out.println("Enter the element");
						item = Stack.sc.nextInt();
						push(item);
						break;
				case 2:
						item = Stack.pop();
						if(item == 0)
						{
							System.out.println("Stack is Underflow");
						}
						else
						{
							System.out.println("Popped item is:"+item);
						}
						
						break;
				case 3:
					item = Stack.peek();
					if(item == 0)
					{
						System.out.println("Stack is Underflow");
					}
					else
					{
						System.out.println("Peek item is:"+item);
					}
					
					break;
				case 4:
						Stack.traverse();
						break;
				case 5:
						System.exit(1);
				default :	
						System.out.println("Invalid Input \n");
			}
		}
		
	}
	static void create()
	{
		
		System.out.println("Enter the size of stack:");
		Stack.size = Stack.sc.nextInt();
		Stack.stack = new int[Stack.size];
		System.out.print("Stack created with size:"+Stack.size);
	}
	
	static void push(int item)
	{
		if(Stack.isFull())
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
		if(Stack.top == size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static int pop()
	{
		if(Stack.isEmpty())
		{
			return 0;
		}
		else
		{
			return Stack.stack[top--];
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
	static int peek()
	{
		if(Stack.isEmpty())
		{
			return 0;
		}
		else
		{
			return Stack.stack[top];
		}
	}
	
	static void traverse()
	{
			
		if(Stack.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		
		else	
		{
			System.out.println("Stack elements are:");
		
			for(int i =top; i>=0; i--)
			{
			System.out.println(Stack.stack[i]);
			}
		}
	}	
}
