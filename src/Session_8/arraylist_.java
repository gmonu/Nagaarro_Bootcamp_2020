package Session_8;

import java.util.Scanner;

public class arraylist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int k = sc.nextInt();
	        int arr1[];
	        int arr2[];
	        arr1 = new int[k];
	        arr2 = new int[k];


	        for(int i = 0; i<k; i++)
	        {
	            arr1[i] = sc.nextInt();
	        } 
	  

	        for(int i = 0; i<k; i++)
	        {
	            arr2[i] = sc.nextInt();
	        }        
	        int m = arr1.length; 
	        int n = arr2.length; 
//	        Arrays.sort(arr1);
//	        Arrays.sort(arr2);
	        PrintIntersection(arr1, arr2);
	        
	}
	
	static void PrintIntersection(int[] x, int[] y)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
	}

}
