import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] num = sc.nextLine().toCharArray();
    
    Arrays.sort(num);
    
    for(int i=num.length - 1; i>=0;i--) {
        System.out.print(num[i]);
    }
}
}
