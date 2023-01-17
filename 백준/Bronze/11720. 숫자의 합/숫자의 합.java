import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		br.close();
		
		int sum = 0;
        
		for(int i = 0; i < a; i++) {
			sum += b.charAt(i)-'0';
		}
		System.out.print(sum);
    }
}