import java.util.*;
import java.math.BigInteger;
 
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
      BigInteger sum = a.add(b);
      System.out.println(sum.toString());
      System.out.println(a.subtract(b));
      System.out.println(a.multiply(b));
  }
}
