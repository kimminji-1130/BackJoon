import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] <= k) {
				sum += k / a[i];
				k = k % a[i];
			}
		}
		System.out.print(sum);
	}
}