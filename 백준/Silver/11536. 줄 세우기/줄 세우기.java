import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,i,s;
		n = Integer.parseInt(br.readLine());
		String[] name = new String[n];
		for(i=0;i<n;i++) name[i] = br.readLine();
		s = 0;
		for(i=0;i<n-1;i++) s += name[i].compareTo(name[i+1])>0?1:-1;
		if(s==n-1) {
			System.out.println("DECREASING");
		}else if(s==1-n) {
			System.out.println("INCREASING");
		}else {
			System.out.println("NEITHER");
		}
	}
}