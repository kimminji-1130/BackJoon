import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int a[] = new int[9];
		int max[] = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		for(int i=0;i<9;i++) {
			a[i] = sc.nextInt();
			if(a[i]<=max[i]) {
				sum += a[i];
			}else {
				System.out.print("hacker");
				break;
			}
			if(i==8) {
				if(sum>=100) System.out.print("draw");
				else System.out.print("none");
			}

		}

	}
}