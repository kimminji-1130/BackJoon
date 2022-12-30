import java.util.Scanner;

public class Main {
      public static int c(int num){
      int result = 0;
    while(num !=0){
      result = result * 10 + num % 10;
      num /=10;
    }
    return result;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    a = c(a);
    b = c(b);
    if(a>b){
      System.out.print(a);
    } else{
      System.out.print(b);
    }
  }

}