package Session_13;

public class Counting_N_Stairs {
	
	public static void main(String args[])
	{
		System.out.println(Count(5));
	}
	public static int Count(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n<0)
		{
			return 0;
		}
		
		int ans = 0;
		ans = Count(n-1) + Count(n-2) + Count(n-3);
		return ans;
	}
	

}
