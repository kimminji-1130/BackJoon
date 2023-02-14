import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(add(a, b));
	}

	static int add(int num, int num2) {
		return num + num2;
	}
}