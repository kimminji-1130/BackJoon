import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		result = (a>b)?a:b;
		int result2 = (a>b)?b:a;
		int max = c>result?c:result;
		int min = c>result2?result2:c;
		if(max==min) {
			System.out.print(10000+a*1000);
		}else if(a!=b && b!=c && c!=a) System.out.println(max*100);
		else {
			if(a==b) System.out.print(1000+a*100);
			else if(b==c) System.out.print(1000+b*100);
			else System.out.print(1000+a*100);
		}
		
	}
	}
