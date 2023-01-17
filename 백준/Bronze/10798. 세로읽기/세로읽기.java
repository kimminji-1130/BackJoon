import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[][] arr = new String[5][15];
		 for(int i=0;i<5;i++) { //가로가 i
			 String[] s = br.readLine().split("");
			for(int j=0;j<s.length;j++) { //세로가 j
				 
				 arr[i][j] = s[j];
				 
			}
		}
		 for(int i=0;i<15;i++) {
			 for(int j=0;j<5;j++) {
				 if(arr[j][i] == null) {
					 continue;
				 }
				 System.out.print(arr[j][i]);
			 }
		 }
		
	}
 
}