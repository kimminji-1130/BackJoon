import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a =  Integer.parseInt(br.readLine());
		int sum = 1;
		for(int i=1;i<=a;i++) {
			sum *= i;
		}
		System.out.print(sum);
	}
 
}