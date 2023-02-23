import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		while (true) {
			int c = in.nextInt();
			int d = in.nextInt();
			if (c == 0 && d == 0)
				break;

			System.out.println(c + d);
		}

		in.close();
	}
}