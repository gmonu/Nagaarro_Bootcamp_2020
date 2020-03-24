package Session_11;

import java.util.Scanner;

public class subsequence {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSS(str, "");
		System.out.println(count);
	}

	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			count++;
			return;
		}
//		count++;
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, res);
		printSS(ros, res + cc);

	}

}
