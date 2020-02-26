package Session_5;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<5; i++)
		{
			arr[i] = in.nextInt();
		}
		for(int i = 0; i<5; i++)
		{
			//int n = in.nextInt();
			if(arr[i]==i)
			{
				//System.out.print(n);
				arr[i] = arr[i];
			}
			else {
				arr[i] = i;
			}
		}
		for(int i = 0; i<5; i++)
		{
			System.out.print(arr[i]);
		}

	}

}
