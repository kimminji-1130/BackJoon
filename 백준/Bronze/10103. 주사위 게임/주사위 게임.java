import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int chang = 100;
		int sang = 100;
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			int s = sc.nextInt();
			if (c > s) {
				sang -= c;
			} else if (c < s) {
				chang -= s;
			}
		}
		System.out.println(chang);
		System.out.print(sang);
	}
}