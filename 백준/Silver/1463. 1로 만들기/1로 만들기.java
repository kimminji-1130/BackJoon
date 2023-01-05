import java.util.Scanner;
public class Main {
	static Integer[] a;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		a = new Integer[N + 1];
		a[0] = a[1] = 0;
		System.out.print(recur(N));
	}
 
	static int recur(int N) {
 
		if (a[N] == null) { 
			if (N % 6 == 0) {
				a[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			else if (N % 3 == 0) {
				a[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			else if (N % 2 == 0) {
				a[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			else {
				a[N] = recur(N - 1) + 1;
			}
		}
		return a[N];
	}
}