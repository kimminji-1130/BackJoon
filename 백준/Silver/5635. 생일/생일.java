import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] total = new int[n];
        String[] array = new String[n];
        int[] sub = new int[n];

        for (int i = 0 ; i < n ; i++) {
            String name = sc.next();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            total[i] = (y * 365) + (m * 31) + d;
            array[i] = name;
            sub[i] = (y * 365) + (m * 31) + d;
        }

        Arrays.sort(total);

        for (int i = 0 ; i < n ; i++) {
            if (total[n-1] == sub[i]) {
                System.out.println(array[i]);
            }
        }

        for (int i = 0 ; i < n ; i++) {
            if (total[0] == sub[i]) {
                System.out.println(array[i]);
            }
        }
    }
}