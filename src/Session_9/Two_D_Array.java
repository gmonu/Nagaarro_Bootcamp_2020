package Session_9;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr;
		arr = new int[m][n];
		for(int i =0; i<m; i++)
		{
			for(int j =0; j<n; j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}
		
		wavePrint(arr);
//		for(int i =0; i<m; i++)
//		{
//			for(int j =0; j<n; j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
			
	}
	public static void wavePrint(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[j][i]+", ");
				}
			}else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
			}
		}
		
		System.out.println("END");
	}
}
