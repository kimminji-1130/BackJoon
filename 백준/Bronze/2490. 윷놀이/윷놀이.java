import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int o = 0;
		int[] a = new int[4];
		for (int j = 0; j < 3; j++) {
			o = 0;
			for (int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 1)
					o++;
			}
			if (o == 0)
				System.out.println("D");
			else if (o == 1)
				System.out.println("C");
			else if (o == 2)
				System.out.println("B");
			else if (o == 3)
				System.out.println("A");
			else if (o == 4)
				System.out.println("E");
		}
	}
}