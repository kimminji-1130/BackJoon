import java.util.*;
	public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=0;;i++){
    int r1 = sc.nextInt();
    int r2 = sc.nextInt();
      if(r1==0 && r2==0) break;
      if(r1%r2==0){
        System.out.println("multiple");
      }else if(r2%r1==0){
        System.out.println("factor");
      }else{
        System.out.println("neither");
      }
    }
    
    }
  }