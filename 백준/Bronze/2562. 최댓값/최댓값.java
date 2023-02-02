import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		int[] z = new int[9];
		int max=-1000000;int num=0;
		
		for(int i=0;i<9;i++) {
			z[i]=sc.nextInt();
			 max = z[i]>max?z[i]:max;
			 if(max==z[i]) num=i+1;
		}
		System.out.println(max);
		System.out.print(num);
		
	}
	}
