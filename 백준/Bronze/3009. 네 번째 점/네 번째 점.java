import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x =new int[2];
		int[] y =new int[2];
		int[] z =new int[2];
		int[] s =new int[2];
		
		for(int i=0;i<2;i++){
			int a = sc.nextInt();
			x[i] = a;
		}
		for(int i=0;i<2;i++){
			int b = sc.nextInt();
			y[i] = b;
		}
		for(int i=0;i<2;i++){
			int c = sc.nextInt();
			z[i] = c;
		}
		for(int i=0;i<2;i++) {
			if(x[i]==y[i]) {
				s[i] = z[i];
			}else if(x[i]==z[i]) {
				s[i] = y[i];
			}else {
				s[i] = x[i];
			}
		}
		for(int i=0;i<2;i++) {
			System.out.print(s[i]+" ");
		}

		}
	}