import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int line = sc.nextInt();
		for(int i=0;i<line;i++)
		{
			int st = sc.nextInt();
			int end = sc.nextInt();
			int ballnum = sc.nextInt();
			for(int j = st-1;j<end;j++)
			{
				arr[j] = ballnum;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	}