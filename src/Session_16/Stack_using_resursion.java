package Session_16;
import java.util.*;

public class Stack_using_resursion {

	static Stack<Integer> st = new Stack<>(); 
		
		static void insert_at_bottom(int x) 
		{ 

			if(st.isEmpty()) 
				st.push(x); 

			else
			{ 
				
				int a = st.peek(); 
				st.pop(); 
				insert_at_bottom(x); 

				st.push(a); 
			} 
		} 
		
		static void reverse() 
		{ 
			if(st.size() > 0) 
			{ 
				
				int x = st.peek(); 
				st.pop(); 
				reverse(); 
				
				insert_at_bottom(x); 
			} 
		} 
		
		public static void main(String[] args) 
		{ 
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i =1; i<=n; i++)
			{
					st.push(sc.nextInt()); 
			}
			

			reverse(); 
			
			
			for(int i = n-1; i>=0; i--)
			{
			System.out.println(st.get(i)); 
			} 
		} 
	} 
