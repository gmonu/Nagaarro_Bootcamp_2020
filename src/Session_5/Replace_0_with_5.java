package Session_5;
import java.util.*;
public class Replace_0_with_5 {
	public static void main(String args[])
	{
	int[] n;
	n = new int[1000];
    
    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    for(int i = 0; i<k; i++)
    {
    n[i] = in.nextInt();
    }
    for(int i = 0; i<k; i++)
    {
         if(n[i] == 0)
         {
        	 n[i] = 5;
         }
    }
    
    for(int i = 0; i<k; i++)
    {
       System.out.print(n[i]); 
        }
    
in.close();
}
}
