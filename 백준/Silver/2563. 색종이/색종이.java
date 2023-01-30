import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[100][100];
		int c=0;
		int c1=0; int c2=0;
		int b = sc.nextInt();
		for(int k=0;k<b;k++) {
			c1 = sc.nextInt();
			c2 = sc.nextInt();
			for(int i= c1;i<c1+10;i++) {
				for(int j= c2;j<c2+10;j++) {
					if(a[i][j]==0) {
						a[i][j]=1;
						c++;
					}
				}
			}
		}

		System.out.println(c);
	}
}