import java.util.*;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String a = sc.next();
		  int t;
		  for(int i=0;i<a.length();i++) {
			  t = (int)a.charAt(i);
			  if(t>=65&&t<=90) t+=32;
			  else t-=32;
			  System.out.print((char)t);
		  }
		  
	}
}