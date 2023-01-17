import java.io.*;
 
public class Main {
 
	public static double bigger(double a, double b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) throws IOException{
		int L;
		double A,B,C,D;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		L= Integer.parseInt(br.readLine());
		A= Double.parseDouble(br.readLine());
		B= Double.parseDouble(br.readLine());
		C= Double.parseDouble(br.readLine());
		D= Double.parseDouble(br.readLine());
		int homework = (int) Math.ceil(bigger(A/C,B/D));
		System.out.println(L-homework);
	}
 
}