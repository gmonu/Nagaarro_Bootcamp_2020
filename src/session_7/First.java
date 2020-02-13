package session_7;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hellofun();
		System.out.println(SimpleInterest(10,20,30));
	}
	public static void Hellofun()
	{
		System.out.println("HelloFun");	
	}
	
	public static int SimpleInterest(int p, int r, int t)
	{
		int result = p*r*t/100;
		
		return result;
	}


}
