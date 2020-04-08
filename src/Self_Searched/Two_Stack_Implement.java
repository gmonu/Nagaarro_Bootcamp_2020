package Self_Searched;

import java.util.Stack; 
import java.util.Scanner;
class Two_Stack_Implement { 
	

	static Stack<Integer> st1 = new Stack<>(); 
	static Stack<Integer> st2 = new Stack<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizearr = sc.nextInt();
		//int arr[] = new int[sizearr];
		int sizes1 = sc.nextInt();
		int sizes2 = sc.nextInt();
		for(int i =0; i<sizes1; i++)
		{
			st1.push(sc.nextInt()); 
		}		
		for(int i =0; i<sizes2; i++)
		{
			st2.push(sc.nextInt());
		}


		System.out.println(st1.get(sizes1-1));
		st1.pop();
		System.out.println(st2.get(sizes2-1));
		st2.pop();
		System.out.println("Elements in stack1 are");
		boolean check = st1.empty();
		boolean check1 = st2.empty();
	if(check)
	{	
		System.out.println("None");
	}
	
		for(int i = sizes1-2; i>=0; i--)
		{

			
			System.out.print(st1.get(i)+"  ");
			st1.pop();
		}

	

		System.out.println("\nElements in stack2 are");		
		if(check1)
		{
			System.out.println("None");
		}
		for(int i = sizes2-2; i>=0; i--)
		{
			
			System.out.print(st2.get(i)+" ");
			st2.pop();
		}
	}

}	