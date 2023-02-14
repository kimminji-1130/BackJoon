import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); //몸무게
			arr[i][1] = sc.nextInt(); //키
		}
		for (int i = 0; i < n; i++) {
			int rank = 1; //랭크는 1부터 시작
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) //j가 키몸무게 다 큰 경우
					rank++; // 겅치가 큰사람 만큼 +
			}
			System.out.print(rank + " ");

		}
	}
}