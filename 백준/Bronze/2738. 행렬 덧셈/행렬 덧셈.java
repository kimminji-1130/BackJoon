import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[100][100];
		int b[][]=new int[100][100];
		int sum[][]=new int[100][100];
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		
		  for(int i=0;i<in1;i++){
			    for(int j=0;j<in2;j++){
			      a[i][j]=sc.nextInt();
			    }
			}
		 
		  for(int i=0;i<in1;i++){
			    for(int j=0;j<in2;j++){
			    	b[i][j]=sc.nextInt();
			    }
			}
		  for(int i=0;i<in1;i++){
			    for(int j=0;j<in2;j++){
			    	sum[i][j]=a[i][j]+b[i][j];
			      System.out.print(sum[i][j] + " ");
			    }
			    System.out.println();
			}
	}
}