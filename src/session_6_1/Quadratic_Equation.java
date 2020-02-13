package session_6_1;
import java.util.*;

public class Quadratic_Equation {
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int c = in.nextInt();

	        in.close();
	        long d = (b*b)-(4*a*c);
	        float r1, r2;
	        if(d < 0) {
	            System.out.println("Imaginary");
	        }
	        else {
	            if(d==0)
	                System.out.println("Real and Equal");
	            else   
	                System.out.println("Real and Distinct");

	            r1 = (-b + (float)Math.sqrt(d)) / (2 * a);
	            r2 = (-b - (float)Math.sqrt(d)) / (2 * a);
	            System.out.print((long)Math.min(r1, r2)+ " " + (long)Math.max(r1, r2));
	        }      
	    }
	}
	

