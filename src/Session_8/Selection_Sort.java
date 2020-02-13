package Session_8;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {10,20,30,40,50};
		
		for(int i =0; i< A.length; i++)

		{
			System.out.print(A[i]);
		}
		
		
		Selection(A);
		System.out.println();
		for(int i =0; i< A.length; i++)

		{
			System.out.print(A[i]);
		}
	}
	
	public static void Selection(int[] a)
	{
		for(int i =0; i<=a.length-1; i++)
		{
			int min = i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]>min)
				{
					min = j;
				}
			}
			swap(a, min, i);
		}
	}
	public static void swap(int[] a,int x, int y)
	{
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
		
	}

}
