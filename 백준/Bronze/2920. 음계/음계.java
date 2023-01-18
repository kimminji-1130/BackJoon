import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] c = {8, 7, 6, 5, 4, 3, 2, 1};
		int[] a = new int[8];
		for(int i=0;i<8;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			
		}
		if(Arrays.equals(a, b)) {
			System.out.print("ascending");
		}else if(Arrays.equals(a, c)) {
			System.out.print("descending");
		}else {
			System.out.print("mixed");
		}
		
	}
 
}