package Session_9;

import java.util.Scanner;

public class String_is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		String s1 = new StringBuffer(s).reverse().toString();
		if(s2.equals(s1))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
//		if(s3.equals(s2))
//			System.out.print("true");
//		else
//			System.out.print("false");

	}

}
