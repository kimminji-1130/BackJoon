import java.util.*;

public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=sc.nextInt();
    int j=sc.nextInt();
    System.out.println(i*(j%10));
    System.out.println(i*(j%100/10));
    System.out.println(i*(j/100));
    System.out.println(i*j);
	}
}