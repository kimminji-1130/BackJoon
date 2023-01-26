import java.util.*;
 
public class Main{
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int[] m = new int[11];
		int[] k = new int[11];
		int M=0;
		int K=0;
		for(int i=0;i<10;i++) {
			m[i] = sc.nextInt();
			}
		for(int i=0;i<10;i++) {
			k[i] = sc.nextInt();
			}
		Arrays.sort(m);
		Arrays.sort(k);
		for(int i=10;i>7;i--) {
			M += m[i];
			K += k[i];
		}
		System.out.print(M+" "+K);
	}
}