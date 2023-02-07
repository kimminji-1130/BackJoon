import java.util.*;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int a = sc.nextInt();
		  for(int i=0;i<a;i++) {
			  String n = sc.next();
			  System.out.print(n.charAt(0));
			  System.out.println(n.charAt(n.length()-1));
		  }
		  
	}
}