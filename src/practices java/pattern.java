import java.util.*;
class Pattern
{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		
				// for(int i = n; i>0; i--)
				// {
				// 	for(int j = i; j>0; j--)
				// 	{
				// 	System.out.print("*\t");
				// 	}
				// 	System.out.println();
				// }
				pattern(n);
				
	}

	public static void pattern(int n)
	{
		if(n<1)
		{
			return;
		}
		printrow(n);
		System.out.println();
		pattern(n-1);
	}
	public static void printrow(int n)
	{
		if(n<1)
		{
			return;
		}
		System.out.print("*\t");
		printrow(n-1);
	}

}