import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[5];
    int av = 0;
    for(int i=0;i<5;i++){
      num[i] = sc.nextInt();
      av += num[i];
    }
          Arrays.sort(num);
        System.out.println(av/5);
      System.out.println(num[2]);
  }
}