import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}