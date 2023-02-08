import java.util.*;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int[][] a = new int[8][2];
		  int[] a1 = new int[5];
		  int sum=0;
		  for(int i=0;i<8;i++) {
			  a[i][0] = sc.nextInt();
			  a[i][1] = i+1;
		  }
		  Arrays.sort(a, new Comparator<int[]>() {
				@Override
				public int compare(int[] a, int[] b) {
					return b[0] - a[0];
				}
			});
		  for(int i=0;i<5;i++) {
			  sum += a[i][0];
				a1[i] = a[i][1];
		  }
		  Arrays.sort(a1);
		  
		  
		  System.out.println(sum);
		  for(int i=0; i<5;i++) {
			  System.out.print(a1[i]+" ");
		  }

	}
}