package Session_5;
import java.util.*;

public class Decimal_to_octal {
	
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();

	        int result = 0;
	        int power = 1;
	        while (n!=0)
	        {
	            int rem = n%8;
	            result = result + rem * power;
	            power = power*10;
	            n = n/8;
	        }
	        System.out.print(result);
	    in.close();
	    }
	}


