import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 설탕키로 수
		int sum = 0; // 봉지 갯수
		while (true) {
			if (a % 5 == 0) {
				sum += a / 5;
				System.out.print(sum);
				break;
			} else {
				a -= 3;
				sum++;
			}
			if (a < 0) {
				System.out.print("-1");
				break;
			}
		}

	}
}