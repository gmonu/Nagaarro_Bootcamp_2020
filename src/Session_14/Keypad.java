package Session_14;

import java.util.Scanner;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printKeypad(str, "");
	}

	public static void printKeypad(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		String code = codes(ch);
		for (int i = 0; i < code.length(); i++) {
			char gc = code.charAt(i);
			printKeypad(ros, res + gc);
		}

	}

	public static String codes(char ch) {
		if (ch == '0') {
			return " ";
		}
		if (ch == '1') {
			return ".+@$";
		}
		if (ch == '2') {
			return "abc";
		}
		if (ch == '3') {
			return "def";
		}
		if (ch == '4') {
			return "ghi";
		}
		if (ch == '5') {
			return "jkl";
		}
		if (ch == '6') {
			return "mno";
		}
		if (ch == '7') {
			return "pqrs";
		}
		if (ch == '8') {
			return "tuv";
		}
		if (ch == '9') {
			return "wxyz";
		}
		

		return null;

	}

}