import java.util.*;
	public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=1;;i++){  
      int n0=0;
      if(sc.hasNextInt()){
         n0= sc.nextInt();
      }
    
    int n1, n2, n3, n4;
      if(n0 == 0) {
      System.out.print(""); break;
    }
    n1 = n0*3;
      System.out.print(i +". ");
    if(n1%2==0){
      System.out.print("even ");
      n2 = n1/2;
    }else{
      System.out.print("odd ");
      n2 = (n1+1)/2;
    }
    n3 =3*n2;
    n4 = n3/9;   
    System.out.println(n4);
    }
    }
  }