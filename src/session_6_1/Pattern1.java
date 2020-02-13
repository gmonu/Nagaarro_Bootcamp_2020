package session_6_1;

import java.util.*;
public class Pattern1 {
    public static void main(String args[]) {
        // Your Code Here
        int n;
        int i,j;
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int key = 1;
        in.close();
        for(i =1; i<=n; i++)
        {
            for(j=1;j<=i;j++)
            {
            	for(int k = n-1; k>1; k-- )
            	{
                    System.out.print(" ");                
            	}

                System.out.print(key+"\t");
                key++;
            }
            
            System.out.println();
        }
    }
}
