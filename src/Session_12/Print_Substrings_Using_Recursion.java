package Session_12;

import java.util.Scanner;

public class Print_Substrings_Using_Recursion {

	static int counter =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
		 String str=sc.nextLine();
		 
	        printP(str,"");
	        System.out.println(counter);
		}
		
		public static void printP(String str,String res) {
			
			if(str.length()==0) {
				System.out.println(res);
				return;
			}
			
			for(int i=0;i<str.length();i++) {
				char cc=str.charAt(i);
				String ros=str.substring(0,i)+str.substring(i+1);
				printP(ros, res+cc);
				
			}
			counter ++;
		}

	}
