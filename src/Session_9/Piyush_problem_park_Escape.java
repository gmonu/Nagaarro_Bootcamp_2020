package Session_9;

import java.util.Scanner;

public class Piyush_problem_park_Escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int k = in.nextInt();
		int s = in.nextInt();
		int i,j;
		
		char[][] arr = new char[m][n];
		
		for(i = 0; i<m; i++)
		{
			for(j = 0; j<n; j++)
			{
				arr[i][j] = in.next().charAt(0);
			}
		}
		outloop:
		for(i = 0; i<m; i++)
		{
			//System.out.println(s);
			for(j = 0; j<n; j++)
			{
				
				if(arr[i][j] == '.')
				{
					if(j==n-1)
					{
						s = s-2;
						System.out.println(s+"Hello");
						break;
					}
					else
					{
					s = s-3;
					break;
					}
				}
				else if(arr[i][j] == '*')
				{

					if(j==n-1) {
						s=s+5;
						break;
					}
					else {
					s = s+4;
					break;
					}
				}
				else if(arr[i][j] == '#')
				{
					break outloop;
				}
			}
		}
		if(s>k)
		{
		System.out.println("Yes");
		System.out.println(s);
		}
	}

}
