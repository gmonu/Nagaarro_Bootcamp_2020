package Session_8;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {50,40,30,20,10};
		for(int i =0; i<n.length; i++)
		{
			System.out.print(n[i]);
		}
		System.out.println();
	
		bubble(n);
		for(int i =0; i<n.length; i++)
		{
			System.out.print(n[i]);
		}
	}
	public static void bubble(int[] a)
	{
		for(int i = 1; i<a.length; i++)
		{
			for(int j = 0; j<a.length-i; j++)
			{
				if(a[j]>a[j+1])
				{
					swap(a, j, j+1);
				
				}
			}	
		}
	}
	
	public static void swap(int[] a,int x, int y)
	{
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
		
	}

}
