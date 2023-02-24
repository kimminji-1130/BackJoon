import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 666;
		int c = 1;
		while (c != a) {
			num++;
			if (String.valueOf(num).contains("666")) {
				c++;
			}
		}
		System.out.println(num);
	}
}