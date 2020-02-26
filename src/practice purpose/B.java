import java.util.*;
class GFG { 
	
	static int maximumChars(String str) 
	{ 
		int n = str.length(); 
		int res = -1; 
		
		for (int i = 0; i < n - 1; i++) 
			for (int j = i + 1; j < n; j++) 
				if (str.charAt(i) == str.charAt(j)) 
					res = Math.max(res, 
						Math.abs(j - i - 1)); 
						
		return res; 
	} 
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
         
         int n =sc.nextInt();
         while(n>0)
        {
            String s = sc.nextLine();
            System.out.println(maximumChars(s));
        n--;
        }
	} 
} 

