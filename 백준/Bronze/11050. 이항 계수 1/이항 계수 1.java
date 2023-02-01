import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int un = 1;
		int yu = 1;
		int up =1;
		for(int i=1;i<=a-b;i++) {
			un *= i;
		}
		for(int i=1;i<=b;i++) {
			yu *= i;
		}
		int under = un*yu;
		for(int i=1;i<=a;i++) {
			up *= i;
		}
		int dap = up/under;
		System.out.println(dap);
	}

}
