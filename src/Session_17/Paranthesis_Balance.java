package Session_17;

import java.util.Scanner;

public class Paranthesis_Balance {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String out = "";
		if(input.length() == 0)
		{
			System.out.println("true");
		}
		else
		{
			
			
			System.out.println(check(input));
		}
		
		
	}
	
	public static String check(String input)
	{
		String store = "";
		String store1 = "";
		
		for(int i =0; i < input.length(); i++)
		{
			
			if(input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(' )
			{
				store += input.charAt(i);
			}
		}
		
		for(int i =0; i < input.length(); i++)
		{
			if(input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')' )
			{
				store1 += input.charAt(i);
			}
		}
		int l = store.length();
		int m = store1.length();
		if(l == m)
		{
			return "true";
		}
		else
		{
			return "false";
		}
	}

}
