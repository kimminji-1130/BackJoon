import java.util.Scanner;

	public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
    if(a>b){
      if(b>c){
          System.out.print(c +" ");
          System.out.print(b  +" ");
          System.out.print(a +" ");
        
        }else{
        if(a>c){
          System.out.print(b +" ");
          System.out.print(c +" ");
          System.out.print(a +" ");
        }else{
          System.out.print(b +" ");
          System.out.print(a +" ");
          System.out.print(c +" ");
        }
        }
      }else{
        if(a>c){
          System.out.print(c +" ");
          System.out.print(a +" ");
          System.out.print(b +" ");
        }else{
          if(b>c){
          System.out.print(a +" ");
          System.out.print(c +" ");
          System.out.print(b +" ");
          }else{
          System.out.print(a +" ");
          System.out.print(b +" ");
          System.out.print(c +" ");
          }
        }
      }
    
    }
  }