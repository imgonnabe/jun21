package jun21;

import java.lang.Math;
// 1~100중에 가장 큰 소수

public class Test03 {
	public static void main(String[] args) {
		int p = 2;
		int n = 3;
		while (true) {
			double t = Math.sqrt(n);
			int m = (int) t;
			for (int i = 2; i <= m; i++) {
				int r = n % i;
				if (r == 0)
					break;
				if (i == m)
					p = n;
			}
			n++;
			if (n > 100)
				break;
		}
		System.out.printf("%d\n", p);
	}
}
