package Session_5;
import java.util.*;
public class Armstrong_number {
	
	public static void main(String args[])
	{
		int num, originalNum, remainder, n = 0;
	    double result = 0.0;
	    Scanner in = new Scanner(System.in);
	    num = in.nextInt();
	    originalNum = num;
	    while (originalNum != 0) {
	        originalNum /= 10;
	        ++n;
	    }
	    originalNum = num;
	    while (originalNum != 0) {
	        remainder = originalNum % 10;
	        result += Math.pow(remainder, n);
	        originalNum /= 10;
	    }
	    
	    
	    if ((int)result == num)
	        System.out.print("True");
	    else
	        System.out.print("False");
	in.close();
	}

}
