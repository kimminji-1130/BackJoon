import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(t-- > 0) {
			int N = sc.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
            
			/*
			 same this
			 if(N > max) max = N;
			 if(N < min) min = N;
			*/
		}
		System.out.println(max * min);
	}
 
}