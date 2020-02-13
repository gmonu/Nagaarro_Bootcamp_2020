package Session_8;

public class Second_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int i = 0; 
		int j = 2;
		System.out.println(arr[i]+" "+arr[j]);
		swap(arr, i ,j);
		System.out.println(arr[i]+" "+arr[j]);
 	}
	public static void swap(int[] n, int i, int j)
	{
		int temp = n[i];
		n[i] = n[j];
		n[j]= temp;
		
		
	}
}
