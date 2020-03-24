package Session_15;

import java.util.Scanner;

public class WaysToCross {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.print(ways(m, n, 0, 0));
	}

	public static int ways(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			return 1;
		}

		if (cr > er && cc > ec) {
			return 0;
		}
		int count = 0;
		for (int i = cc; i < ec; i++) {
			count = count + ways(er, ec, cr, i + 1);
		}

		for (int i = cr; i < er; i++) {
			count = count + ways(er, ec, i + 1, cc);
		}

		return count;
	}
}