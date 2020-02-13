package session_6_1;

import java.util.*;
public class prime_number_series{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long n, i; 
        n = sc.nextLong();
        sc.close();
        int count = 0;

        for (long num = 2; num <= n; ++num) {
            i = 2;
            while (i < num) {
                if (num % i == 0)
                    break;
                i += 1;
            }
            if (i == num) {
                if (count == 1) 
                    System.out.print(", ");
                System.out.print(num);
                count = 1;
            }
        }
       
	}

}