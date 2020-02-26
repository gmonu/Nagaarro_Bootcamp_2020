package Session_9;

import java.util.Scanner;

public class codekaze2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		int sum1 =0;
		int sum2 =0;
		for(int k = 0; k<8; k++)
		{
			a[k] = sc.nextInt();
		}
		for(int i =0; i<4; i++)
		{
			
			sum1 = sum1 + a[i]; 
		}
		for(int j =4; j<8; j++)
		{
			sum2 = sum2 +a[j];
		}
		
		if(sum1 >=sum2)
		{
			System.out.println(sum1);
		}
		else
		{
			System.out.println(sum2);
		}

	}

}
