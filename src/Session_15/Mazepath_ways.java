package Session_15;

import java.util.Scanner;

class MazePath_ways {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		mazepath(0, 0, n1, n2, "");
		System.out.println();
		System.out.println(mazepath1(0, 0, n1, n2));

	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + " ");
			return;
		}
		if (cr > er || cc > ec)
			return;

		// vertical
		mazepath(cr + 1, cc, er, ec, ans + "V");
		// horizontal
		mazepath(cr, cc + 1, er, ec, ans + "H");
		// diagonal
		mazepath(cr + 1, cc + 1, er, ec, ans + "D");

	}

	public static int mazepath1(int cr, int cc, int er, int ec) {

		if (cr == er - 1 && cc == ec - 1) {
			return 1;
		}
		if (cr > er || cc > ec)
			return 0;
		int c = 0;
		// vertical
		c += mazepath1(cr + 1, cc, er, ec);
		// horizontal
		c += mazepath1(cr, cc + 1, er, ec);
		// diagonal
		c += mazepath1(cr + 1, cc + 1, er, ec);
		return c;
	}

}