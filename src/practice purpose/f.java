import java.util.*;
class Result 
{
    static int lastIndex(int input[], int size, int x, int currIndex){
    if(currIndex== size){
        return -1;
    }

    int index = lastIndex(input,size,x,currIndex+1);
    
    if(index == -1 && input[currIndex] == x){
        return currIndex;
    }
    else{
        return index;
    }
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
   int[] arr = new int[n];
   for(int i =0; i<n; i++)
   {
    arr[i] = sc.nextInt(); 
   }
   int m = sc.nextInt();
    int result = lastIndex(arr,n,m,0);
    System.out.println(result);
}
}