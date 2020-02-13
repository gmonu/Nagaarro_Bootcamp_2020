package session_7;
import java.util.*;
class print_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col, star;
    
        row = n;
        while (row >= 1) {
            col = 1;
            while (col <= row) {
                System.out.print(col + "  ");
                col += 1;
            }
            star = 1;
            while (star <= 2 * (n-row)-1) {
                System.out.print("* ");
                star += 1;
            }
            System.out.println();
            row -= 1;
        }
    sc.close();
    }
}
