import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b == 1 || a < 12 || a > 16) {
			System.out.print("280");
		} else if (b == 0 || a >= 12 && a <= 16) {
			System.out.print("320");
		}
	}
}