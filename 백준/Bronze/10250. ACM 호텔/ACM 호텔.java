import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = 0;
		int y = 0;
		for (int i = 0; i < t; i++) {

				int h = sc.nextInt(); // 층 수
			int w = sc.nextInt(); // 각 층의 방 수
			int n = sc.nextInt(); // 몇번쨰 손님인가

				if (n % h == 0) {
				System.out.println((h * 100) + (n / h));

				} else {
				System.out.println(((n % h) * 100) + ((n / h) + 1));
			}
		}
	}
}