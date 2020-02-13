package Session_5;
import java.util.*;

public class Cumulative_Sum_if_Negative_end {
	
	    public static void main(String args[]) {
	        int sum = 0;
	        Scanner in = new Scanner(System.in);
	        int[] arr; 
	        arr = new int[10000];
	        int n = in.nextInt();

	        for (int i = 0; i<n; i++)
	        {
	            arr[n] = in.nextInt();

	        }
	 
	       
	     for(int i = 0; i<n; i++) {
	                sum = sum + arr[n];
	                if(sum < 0)
	                {
	                    break;
	                  
	                }
	                System.out.println(arr[n]);
	                
	          }      
	         
	        in.close();

	    }
	}


