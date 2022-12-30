import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[26];
    String al = sc.nextLine();
    for(int i=0;i<a.length;i++){
      a[i] = -1;
      a[i] = al.indexOf((char)i+97);
    }
    for(int i :a){
      System.out.print(i+" ");
    }
  }
}