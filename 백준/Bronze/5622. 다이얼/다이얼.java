import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String a = br.readLine();
    	int num =0;
    	for(int i=0;i<a.length();i++) {
    		int code =(int)a.charAt(i)-65;
    		if(code == 18 || code == 21 || code == 24) {
    			code = (int) a.charAt(i)-65 -1;
    		}else if(code == 25) {
        		code = (int) a.charAt(i)-65 -2;
        	}
        	num += (code/3)+2;
        }
        System.out.println(num+a.length());
    }
}