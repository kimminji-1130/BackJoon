import java.util.*;
	public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
    String r1 = sc.next();
      if(r1.length()>3){
        r1 = r1.substring(r1.length()-1);
      }
    int r2 = Integer.parseInt(r1);
    if(r2 % 2==0){
      System.out.println("even");
    }else{
      System.out.println("odd");
    }
    }
    }
  }