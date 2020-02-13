package Session_5;
import java.util.*;
public class Octal_to_Binary {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
            int take = in.nextInt();
          
            System.out.println(o_b(take));
    in.close();
    }
    public static int o_b(int n)
    {
        int result = 0;
        int power = 1;
        int result1 = 0;
        int power1  = 1;
        int rem1;
        int rem;
            while(n>0)
            {
                rem = n%10;
                result = result + rem*power;
                power = power*8;
                n= n/10;
            }
        while(result>0)
        {
                rem1 = result%2;
                result1 = result1 + rem1*power1;
                power1 = power1*10;
                result= result/2;
        }

       
            return result1;
       
    }
}