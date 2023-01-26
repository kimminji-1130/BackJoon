import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean[] b = new boolean[2001];
		for(int i=0;i<a;i++) {
			int num = sc.nextInt();
			b[num+1000] = true;}
		for(int i=0;i<2001;i++) {
			if(b[i]==true) {
		System.out.print((i-1000) + " ");
		}
	}
	}
}