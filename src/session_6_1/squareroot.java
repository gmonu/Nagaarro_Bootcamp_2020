package session_6_1;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		int p =3;
		int inc = 1;
		double ans=1;
		//integral part
		while(ans*ans<=num)
		{
			ans=ans+inc;
		}
		ans = ans-inc;
		
		double inc1 =0.1;
		for(int i =0; i<p;i++)
		{
			while(ans*ans<=num)
			{
				ans = ans+inc1;
			}
			ans = ans-inc1;
			inc1 = inc1/10;
			
		}
		ans = (int)Math.round(ans*1000);
		ans = ans/1000;
		System.out.println(ans);
	}
	

}
