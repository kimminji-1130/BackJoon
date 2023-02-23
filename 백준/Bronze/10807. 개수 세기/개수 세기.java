import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] b = new int[n];
		int c = 0;
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
		int v = in.nextInt();
		for (int i = 0; i < n; i++) {
			if (b[i] == v)
				c++;
		}
		System.out.print(c);
	}
}