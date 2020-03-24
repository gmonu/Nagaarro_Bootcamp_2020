package Session_16;

import java.util.Scanner;

public class Permutation_without_repitition {
	
		static void printDistinctPermutn(String str, 
										String ans) 
		{ 
			if (str.length() == 0) { 

				System.out.println(ans + " "); 
				return; 
			} 

			boolean alpha[] = new boolean[26]; 

			for (int i = 0; i < str.length(); i++) { 

				char ch = str.charAt(i); 

				String ros = str.substring(0, i) + 
							str.substring(i + 1); 

				if (alpha[ch - 'a'] == false) 
					printDistinctPermutn(ros, ans + ch); 
				alpha[ch - 'a'] = true; 
			} 
		} 

		public static void main(String[] args) 
		{ 
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine(); 
			printDistinctPermutn(s, ""); 
			
		} 
	} 
