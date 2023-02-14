import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); // 시험장
		long[] a = new long[(int) n];// 시험장의 사람
		long sum = 0; // 감독관 최소 수
		long count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();// 사람수 입력
		}
		long b = sc.nextInt();// 총감독 감시가능 명수
		long c = sc.nextInt();// 부감독 감시가능 명수

		for (int i = 0; i < n; i++) {
			sum = a[i];
			sum -= b;
			if (sum < 1) {
				// 총감독관으로 끝날때.
				count++;
			} else if (sum > 0) {
				count++;
				long re = sum % c;
				long qu = sum / c;
				count += qu;
				if (re > 0) {
					count++;
				}
			}

		}
		System.out.print(count);
	}
}