import java.util.*;
 
public class Main{
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] a = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		
		Arrays.sort(a, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(a[i][0] + " " + a[i][1]);
		}
	}
}