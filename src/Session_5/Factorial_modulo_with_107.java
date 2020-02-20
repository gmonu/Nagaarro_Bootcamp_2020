package Session_5;
import java.util.*;

public class Factorial_modulo_with_107 {
	
	
    public static long factorial (long num) {
        long fact = 1, i = 2;
        while (i <= num) {
            fact *= i;
            i += 1; 
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long inputs = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= inputs; i++) {
                long num = sc.nextLong();
                sum += factorial(num);
        }
        sum = sum%107;
        System.out.print(sum);
    }

}