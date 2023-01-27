import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}
}