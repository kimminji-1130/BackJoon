import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
 
		int day = (c - b) / (a - b);
		if ((c - b) % (a - b) != 0)
			day++;
 
		System.out.println(day);
		
	}
 
}