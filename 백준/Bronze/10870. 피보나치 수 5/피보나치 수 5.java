import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int a = in.nextInt();
 
		System.out.println(fibonacci(a));
 
	}
 
	// 피보나치 함수
	static int fibonacci(int a) {
		if (a == 0)	return 0;
		if (a == 1)	return 1;
		return fibonacci(a - 1) + fibonacci(a - 2);
	}
}