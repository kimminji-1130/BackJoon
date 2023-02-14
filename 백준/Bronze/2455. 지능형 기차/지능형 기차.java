import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int human = 0; // 기차안의 사람 수
		int max = 0;
		for (int i = 0; i < 4; i++) { // 총 4정거장
			int down = sc.nextInt(); // 내린 사람 수
			int up = sc.nextInt(); // 탄 사람 수
			human -= down;
			human += up;
			if (human > max)
				max = human;
		}
		System.out.print(max);
	}
}