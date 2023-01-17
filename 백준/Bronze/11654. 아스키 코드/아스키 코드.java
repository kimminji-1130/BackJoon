import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	char a = br.readLine().charAt(0);
    	int num = (int)a;
        System.out.println(num);
    }
}