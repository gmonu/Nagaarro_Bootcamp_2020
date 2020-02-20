package Session_8;

import java.util.Scanner;
import java.util.Arrays;
class Sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr;
		arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
	int target = in.nextInt();

	for(int i =0; i < arr.length-2; i++)
	{
		
		for(int j = i+1; j < arr.length-1; j++)
			{
						for(int k = j+1; k < arr.length; k++)
						{
								if(arr[i] + arr[j] + arr[k] == target)
									{
											System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
									}
						}
			}
	}
	
		}
		
	}


