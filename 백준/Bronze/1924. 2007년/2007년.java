import java.util.*;
 
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int d = sc.nextInt();
      for(int i=1;i<m;i++){
        if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
          d+=31;
        }else if(i==2){
          d+=28;
        }else{
          d+=30;
        }
      }

      switch(d%7) {
      case 1: 
          System.out.print("MON");
         break;
      case 2: System.out.print("TUE");
         break;
      case 3: System.out.print("WED");
         break;
      case 4: System.out.print("THU");
         break;
      case 5: System.out.print("FRI");
         break;
      case 6: System.out.print("SAT");
         break;
      default: System.out.print("SUN");
         break;
}
      
    }
}
