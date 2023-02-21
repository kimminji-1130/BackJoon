import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		if (b > a) {
			System.out.println(b - a - 1);
			for (long i = a + 1; i < b; i++)
				System.out.print(i + " ");
		} else if (a > b) {
			System.out.println(a - b - 1);
			for (long i = b + 1; i < a; i++)
				System.out.print(i + " ");
		} else if (a == b) {
			System.out.print("0");
		}
	}
}