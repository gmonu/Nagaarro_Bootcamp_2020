import java.util.*;
class RemoveDuplicateInArrayExample{  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
       Scanner in = new Scanner(System.in);
			int n = in.nextInt();

			
			int[] a;
			a = new int[n];
			for(int i = 0; i < a.length; i++)
			{
				a[i]=in.nextInt();
			}  
        int length = a.length;  
        length = removeDuplicateElements(a, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(a[i]+" ");  
    }  
}  