
import java.util.*;
 class f { 

	public int[] AllIndexesRecursive(int input[], 
								int x, int start) 
	{ 
	
		if (start == input.length) { 
			int[] ans = new int[0]; // empty array 
			return ans; 
		} 

		int[] smallIndex = AllIndexesRecursive(input, x, 
											start + 1); 

		if (input[start] == x) { 
			int[] myAns = new int[smallIndex.length + 1]; 

			myAns[0] = start; 
			for (int i = 0; i < smallIndex.length; i++) { 
				
				myAns[i + 1] = smallIndex[i]; 
			} 
			return myAns; 
		} 
		else { 
			
			return smallIndex; 
		} 
	} 

	public int[] AllIndexes(int input[], int x) 
	{ 

		return AllIndexesRecursive(input, x, 0); 
	} 
	
	public static void main(String args[]) 
	{ 
		f g = new f(); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i =0; i<n; i++)
		{

		  arr[i] = sc.nextInt();
		}

		int x = sc.nextInt();
		
		int output[] = g.AllIndexes(arr, x); 
		
		for (int i = 0; i < output.length; i++) { 
			System.out.print(output[i] + " "); 
		} 
	} 
} 
