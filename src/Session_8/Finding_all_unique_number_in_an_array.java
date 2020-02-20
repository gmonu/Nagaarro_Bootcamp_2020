
import java.util.*; 

public class Finding_all_unique_number_in_an_array 
{ 


static void occurredOnce(int arr[], int n) 
{ 
	Arrays.sort(arr); 

	if (arr[0] != arr[1]) 
		System.out.println(arr[0] + " "); 
	for (int i = 1; i < n - 1; i++) 
		if (arr[i] != arr[i + 1] && 
			arr[i] != arr[i - 1]) 
			System.out.print(arr[i] + " "); 
	if (arr[n - 2] != arr[n - 1]) 
		System.out.print(arr[n - 1] + " "); 
} 

public static void main(String args[]) 
{ 
	int arr[] = {7, 7, 8, 8, 9, 
				1, 1, 4, 2, 2}; 
	int n = arr.length; 

	occurredOnce(arr, n); 
} 
} 

