package Session_8;

import java.util.*;


public class Intersection_Arrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0; i<nums1.length; i++){
	        if(i==0 || (i>0 && nums1[i]!=nums1[i-1])){
	            if(Arrays.binarySearch(nums2, nums1[i])>-1){
	                list.add(nums1[i]);
	            }
	        }
	    }
	 
//	    int[] result = new int[list.size()];
//	    int k=0;
//	    for(int i: list){
//	        result[k++] = i;
//	    }
//	 
//	    return result;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr;
		arr = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=in.nextInt();
		}
		
		int[] arr2;
		arr2 = new int[n];
		for(int i = 0; i<arr2.length; i++)
		{
			arr2[i]=in.nextInt();
		}
		System.out.println(intersection(arr,arr2));
		
		
	
	}
}
	
	