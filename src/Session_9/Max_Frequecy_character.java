package Session_9;

import java.util.Scanner;

public class Max_Frequecy_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int len = input.length();
		char b[] = new char[input.length()];
		char c[] = new char[input.length()];
		int d[] = new int[input.length()];
		
		for(int i =0; i<len; i++)
		{
			b[i] = input.charAt(i);
			c[i] = input.charAt(i);
			
		}
		for(int i =0; i<len; i++)
		{
			while(input!= " ")
			{
				int init =0;
				if(c[init]==b[i])
						{
							d[i] = d[i]+1;
						}
				init = init+1;
			}
		}
		
		

	}

}
