import java.util.*;

public class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int c[]= new int[1000001];
     c[0]=0;
     c[1]=0;
     c[2]=1;
     c[3]=1;
     for(int i=4;i<=a;i++){
        c[i] = c[i-1]+1;
       if(i%2==0){
         if(c[i/2]+1<c[i]){
           c[i] = c[i/2]+1;
         }
       }
       if(i%3==0){
         if(c[i/3]+1<c[i]){
           c[i] = c[i/3]+1;
         }
       }
       
     }
     System.out.print(c[a]);
    }
  }