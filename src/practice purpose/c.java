
import java.util.*;
class GFG { 
	
		static int maxRepeating(String str) 
		{ 
			int n = str.length(); 
			int count = 0; 
			char res = str.charAt(0); 
			int cur_count = 1; 

			for (int i = 0; i < n; i++) 

			{ 
				
				if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) 
					cur_count++; 

			else
				{ 
					if (cur_count > count) 
					{ 
						count = cur_count; 
						res = str.charAt(i); 
					} 
					cur_count = 1; 
				} 
			} 
			return count; 
		} 

		public static void main(String args[]) 
		{ 
			Scanner sc = new Scanner(System.in);
	         
	         String testcases =sc.nextLine();
	         int i = Integer.parseInt(testcases);
	         while(i>0)
	         {
			String str = sc.nextLine(); 
			System.out.println(maxRepeating(str)); 
			i--;
			}
		} 
	} 

