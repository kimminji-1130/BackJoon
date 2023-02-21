import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kim = sc.nextInt();
		int im = sc.nextInt();
		int sum = 0;
		while (true) {
			if (kim == im)
				break;
			kim = kim / 2 + kim % 2;
			im = im / 2 + im % 2;
			sum++;
		}
		System.out.println(sum);
	}
}