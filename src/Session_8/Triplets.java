

import java.util.Scanner;
import java.util.Arrays;
class Sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			
			double[] arr;
			arr = new double[n];
			for(int i = 0; i < arr.length; i++)
			{
				arr[i]=in.nextDouble();
			}
			Arrays.sort(arr);
		double target = in.nextDouble();

		for(int i =0; i < arr.length; i++)
		{
			
			for(int j = i+1; j < arr.length; j++)
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


