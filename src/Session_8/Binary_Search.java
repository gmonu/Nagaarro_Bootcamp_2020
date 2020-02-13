package Session_8;

public class Binary_Search {
	public static void main(String args[])
	{
		int[] arr = {10,20,30,40,50,60};
		int data = 20;
		
		System.out.println(Binary(arr, data));
	}
	
	static int Binary(int[] n, int data)
	{
		int left = 0;
		int right = n.length-1;
		
		while(left<=right)
		{
			int mid = left+right/2; 
			if(n[mid]==data)
				return n[mid];
			
			else if(n[mid]>data)
				right = mid - 1;
			
			else 
				left = mid + 1;
	
		}
		return -1;
	}

}
