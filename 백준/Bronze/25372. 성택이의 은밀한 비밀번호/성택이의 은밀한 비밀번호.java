import java.util.*;

	public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String pass;
		int x = sc.nextInt();
		
		for(int i=0;i<x;i++)
		{
		pass = sc.next();
		if(pass.length()>=6 && pass.length()<=9)	
			System.out.println("yes");
		else 
			System.out.println("no");
		}
	}
}