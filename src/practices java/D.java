
import java.io.*; 
import java.util.*;
class Add { 

	static int calSumUtil(int a[], int b[], 
								int n, int m) 
	{ 
		int[] sum= new int[n]; 
	
		int i = n - 1, j = m - 1, k = n - 1; 
	
		int carry = 0, s = 0; 
	
		while (j >= 0) 
		{ 
			s = a[i] + b[j] + carry; 
			
			sum[k] = (s % 10); 
	
			carry = s / 10; 
	
			k--; 
			i--; 
			j--; 
		} 
	
		while (i >= 0) 
		{ 
			s = a[i] + carry; 
			sum[k] = (s % 10); 
			carry = s / 10; 
	
			i--; 
			k--; 
		} 
	
		int ans = 0; 
	
		if (carry == 1) 
			ans = 10; 
	
		for ( i = 0; i <= n - 1; i++) { 
			ans += sum[i]; 
			ans *= 10; 
		} 
	
		return ans / 10; 
	} 
	
	static int calSum(int a[], int b[], int n, 
										int m) 
	{ 
		if (n >= m) 
			return calSumUtil(a, b, n, m); 
			
		else
			return calSumUtil(b, a, m, n); 
			
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a[] = new int[m];
		for(int i =0; i<m; i++)
		{
			a[i]=sc.nextInt(); 
		} 
	    int n = sc.nextInt();
		int b[] = new int[n];
		for(int i =0; i<n; i++)
		{
			b[i]=sc.nextInt(); 
		} 
			int al = a.length; 
			int bl= b.length; 
		int ss = calSum(a, b, al, bl); 
		int rev = 0;
		while(ss >0)
		{
			rev = rev*10+ss%10;
			ss = ss/10;
		}
		while(rev !=0)
		{
			int rem = rev%10;
			System.out.print(rem+", ");
			rev = rev/10;
		}
		System.out.print("END");
	} 
} 

