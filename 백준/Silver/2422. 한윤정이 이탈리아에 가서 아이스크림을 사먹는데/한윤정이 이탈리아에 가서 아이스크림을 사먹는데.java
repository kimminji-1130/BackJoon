import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] pairs = new boolean[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			pairs[a][b] = true;
			pairs[b][a] = true;
		}
		int result = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (pairs[i][j])
					continue;
				for (int k = j + 1; k <= n; k++) {
					if (!pairs[j][k] && !pairs[k][i]) {
						result++;
					}
				}
			}
		}
		System.out.println(result);

	}
}