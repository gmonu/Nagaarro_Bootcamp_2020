package Session_5;
import java.util.Scanner;
public class lcm {
	
	public static void main(String args[])
	{
		  Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          sc.close();
          int lcm;
          if(a>b)
          { lcm = a;}
          else { lcm =b;}
          while(true)
          {
              if(lcm%a==0 && lcm%b==0)
              {
                  System.out.print(lcm);
                  break;
              }
          ++lcm;
          }
}
	}

