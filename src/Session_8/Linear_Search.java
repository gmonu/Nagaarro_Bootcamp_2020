package Session_8;
import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr;
		arr = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=in.nextInt();
		}
		int m = in.nextInt();
		System.out.println(linear(arr,m));
				
	}
static int linear(int[] n, int data)
{
	for(int i = 0; i < n.length; i++)
	{
		if(n[i] == data)
		{
			return i;
		}
	}
return -1;
}
}
