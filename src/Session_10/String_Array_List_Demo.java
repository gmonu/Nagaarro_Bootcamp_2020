package Session_10;

import java.util.ArrayList;

public class String_Array_List_Demo {
		public static void main(String args[])
		{
			String str = "Monu";
			ArrayList<String> list = new ArrayList<String>();
			list.add("Hi");
			list.add("My");
			
			list.add("Name");
			
			list.add("is");
			
			list.add("Monu");
			
			for(int i = 0; i<list.size(); i++)
			{
				if(str.equals(list.get(i)))
				{
					System.out.println("True");
				}
				else {
					System.out.println("False");
				}
			}
			
		}
}
