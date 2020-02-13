package session_6_1;

import java.util.*;
public class print_series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N1, N2; 
        N1 = sc.nextLong();
        N2 = sc.nextLong();
        sc.close();
        long i = 1, k = 1;
        while (i <= N1) {
            if ((3*k+2) % N2 != 0) {
                System.out.println(3*k+2);
                i += 1;
            }
            k += 1;
        }
    }
}