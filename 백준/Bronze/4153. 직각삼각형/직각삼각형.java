import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0&&b==0&&c==0) break;
			int[] d= new int[3];
			d[0]=a; d[1]=b; d[2]=c;
			Arrays.sort(d);
			if(d[2]*d[2]==d[1]*d[1]+d[0]*d[0]) System.out.println("right");
			else System.out.println("wrong");
		}
	}
	}
