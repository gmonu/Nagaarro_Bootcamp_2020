package Session_5;
import java.util.*;
class Print_All_Arstrong_number
{
    public static void main(String[] args) 
     {
        int n;
        double sum = 0.0;
        int b;
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();


        
        for(int i = start; i <= end; i++)
        {
           int length = String.valueOf(i).length();
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + Math.pow(b,length);
                n = n / 10;
            }
            if((int)sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    in.close();
     }
}