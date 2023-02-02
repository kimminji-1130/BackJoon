import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] z = new int[a];
		int max=-1000000; int min=1000000;
		
		for(int i=0;i<a;i++) {
			z[i]=sc.nextInt();
			 min = z[i]<min?z[i]:min;
			 max = z[i]>max?z[i]:max;
		}
		System.out.print(min+" "+max);
		
	}
	}
