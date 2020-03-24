package Session_13;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--)
		{
			reverse += input.charAt(i); 
		}
		
		if(reverse.equals(input))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
