package Session_5;

import java.util.*;
public class Reverse {

	public static void main(String args[])
	{

        int n;
        int rev=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while(n>0)
        {
            rev = rev*10+n%10;
            n = n/10;
        } 
        System.out.print(rev);
        in.close();
	}
}
