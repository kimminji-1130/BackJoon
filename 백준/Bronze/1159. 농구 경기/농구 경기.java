import java.io.*;
 
public class Main {
	static int[] su = new int[26];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String name = br.readLine();
			char ch = name.charAt(0);
			su[ch-97]++;
		}
		boolean sign = false;
		for(int i=0;i<su.length;i++) {if(su[i]>=5) {
			sign = true;
			System.out.print((char)(i+97));
		}
	}
		if(!sign) System.out.println("PREDAJA");
	}
 
}