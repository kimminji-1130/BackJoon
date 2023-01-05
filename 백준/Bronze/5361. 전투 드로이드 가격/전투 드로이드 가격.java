import java.util.*;
	public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
      float a = sc.nextInt();
      float b = sc.nextInt();
      float c = sc.nextInt();
      float d = sc.nextInt();
      float e = sc.nextInt();
      a *=350.34;
      b *=230.90;
      c *=190.55;
      d *=125.30;
      e *=180.90;
      System.out.print("$");
      System.out.printf("%.2f", a+b+c+d+e);
      System.out.println();
    }
    }
  }