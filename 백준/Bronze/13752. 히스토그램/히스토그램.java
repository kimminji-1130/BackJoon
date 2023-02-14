import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < b; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}