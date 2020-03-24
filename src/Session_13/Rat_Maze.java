package Session_13;

import java.util.Scanner;

public class Rat_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] maze= new int[m][n];
	
		for(int i =0; i< m; i++)
		{
			for(int j =0; j<n; j++)
			{
				maze[i][j] = sc.nextInt();
			}
		}
		for(int i =0; i< m; i++)
		{
			for(int j =0; j<n; j++)
			{
				if(maze[i][j+1] == 9 && maze[i][j] == 0)
				{
					maze[i][j] = 1;
					break;
				}
				else {
					System.out.println("-1");
				}
			}
		}
		
		
		for(int i =0; i< m; i++)
		{
			for(int j =0; j<n; j++)
			{
				System.out.print(maze[i][j] +" ");
			}
			System.out.println("");
		}

	}

}
