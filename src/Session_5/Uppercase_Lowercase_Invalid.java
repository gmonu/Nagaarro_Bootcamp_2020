package Session_5;
import java.util.*;

public class Uppercase_Lowercase_Invalid {
	    public static void main(String args[]) {

	    Scanner a = new Scanner(System.in);
	    char input = a.next().charAt(0); 
	    boolean lorn=false;
	    if(input>='a'&&input<='z')
	        {System.out.println("lowercase");
	            lorn=true;
	        }

	    if(input>='A'&&input<='Z')
	        {System.out.println("UPPERCASE");
	            lorn=true;
	        }

	    if(lorn==false){System.out.println("Invalid");

	    }
a.close();
	    }
	}
	
