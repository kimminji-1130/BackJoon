import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    int winner = 1;  // 우승자
        int total = 0;  // 우승자의 점수
		for(int i=1;i<=5;i++) { //세로
			st = new StringTokenizer(br.readLine());
			 int current = 0;
	            while (st.hasMoreTokens()) {
	                current += Integer.parseInt(st.nextToken());
	            }
	            //현재 점수가 우승자의 점수보다 높으면
	            if (current > total) {
	                winner = i;
	                total = current;
	            }
	        }
	        System.out.print(winner + " " + total);
	}
 
}