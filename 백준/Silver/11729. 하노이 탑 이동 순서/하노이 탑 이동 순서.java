import java.util.*;
 
public class Main {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	public static void Hanoi(int N, int start, int mid, int to) {
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		Hanoi(N - 1, start, to, mid);
    
		sb.append(start + " " + to + "\n");
    
		Hanoi(N - 1, mid, start, to);
 
	}
}