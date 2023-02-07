import java.util.*;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int top = -1;	
		  
			int K = sc.nextInt();
			int[] a = new int[K];
			
	 
			for(int i = 0; i < K; i++) {
				
				int number = sc.nextInt();	
				
				if (number == 0) {	 
					top--;	
				} 
				else {
					top++;	
					a[top] = number;	
				}
			}
			int sum = 0;
			for (int i = 0; i <= top; i++) {	
				sum += a[i];
			}
			System.out.println(sum);
	}
}