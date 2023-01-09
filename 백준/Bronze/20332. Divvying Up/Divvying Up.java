import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int c=0;
      for(int i=0;i<a;i++){
       int b = sc.nextInt();
        c += b;
      }
        if(c%3==0){
          System.out.print("yes");
        }else{
          System.out.print("no");
        }
    }
}