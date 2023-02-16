import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long m = (int) Math.sqrt(2 * s);
		while (m * m + m > 2 * s) {
			m -= 1;
		}
		System.out.print(m);
	}
}