import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String[] a = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String st = in.nextLine();
		for (int i = 0; i < a.length; i++) {
			if (st.contains(a[i]))
				st = st.replace(a[i], "!");
		}
		System.out.print(st.length());
	}
}