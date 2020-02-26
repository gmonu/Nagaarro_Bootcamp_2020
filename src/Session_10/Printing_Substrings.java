package Session_10;

import java.util.Scanner;

public class Printing_Substrings {
	 public static void SubString(String str, int n) 
	    { 
	       for (int i = 0; i < n; i++)
	       {
	           for (int j = i+1; j <= n; j++) 
	             
	           {
	                System.out.println(str.substring(i, j)); 
	           }    
	       } 
	    }  
	  
	    public static void main(String[] args) 
	    { 
	        String str;
	        Scanner sc = new Scanner(System.in);
	        str = sc.nextLine();
	        SubString(str, str.length()); 
	    } 
}