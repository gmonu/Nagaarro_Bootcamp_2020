package Session_5;

import java.util.Scanner;

public class Countset_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		
		int t = in.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i<t; i++)
		{
			arr[i] = in.nextInt();
//			arr[i] = B_to_D(take);
			
		}
		
		for(int i =0; i<t; i++)
		{
			System.out.println(count(arr[i]));
		}
	}
	static int count(int n)
	{
		int count = 0; 
        while (n > 0) { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
	}
	
//	static int B_to_D(int n)
//	{
//		int power = 1;
//		int result = 0;
//		while(n!=0)
//		{
//			int rem = n%2;
//			result = result+rem*power;
//			power = power * 10;
//			n = n/2;
//		}
//		return result;
//	}

}
