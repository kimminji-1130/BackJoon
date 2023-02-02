import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        Map<Integer,Integer> map=new HashMap<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            int val=Integer.parseInt(st.nextToken());
            map.put(val,1);
        }
        int c=0;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            int val=Integer.parseInt(st.nextToken());
            if(map.containsKey(val)) ++c;
        }
        System.out.println(a+b-2*c);
    }
}