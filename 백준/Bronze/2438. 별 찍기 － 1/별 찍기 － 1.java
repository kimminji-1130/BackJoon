import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        for(int i=0; i<a; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}