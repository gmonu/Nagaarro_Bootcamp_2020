
import java.util.*;
class replace { 

	
	public String replacePi(String str) 
	{ 
		if (str.length() <= 1) { 
			return str; 
		} 

		if (str.charAt(0) == 'p' && str.length() >= 2
			&& str.charAt(1) == 'i') { 
			return "3.14" + replacePi(str.substring(2, str.length())); 
		} 
		return str.charAt(0) + replacePi(str.substring(1, str.length())); 
	} 

	public static void main(String args[]) 
	{ 
		replace g = new replace();
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
        for(int i=0; i<t+1; i++)
        {
		String str = sc.nextLine(); 
		System.out.println(g.replacePi(str)); 
		}
	} 
} 
