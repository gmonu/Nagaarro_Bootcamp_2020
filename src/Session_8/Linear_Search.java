package Session_8;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,34,21,1,34,12};
		int data = 34;
		
		
		System.out.println(linear(arr,data));
				
	}
static int linear(int[] n, int data)
{
	for(int i = 0; i < n.length; i++)
	{
		if(n[i] == data)
		{
			return n[i];
		}
	}
return -1;
}
}
