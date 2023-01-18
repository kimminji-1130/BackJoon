import java.util.*;
 
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int a = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(a);
		in.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
 
}