import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int dap=0;
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        
        for(int i=0;i<n;i++) {
        	sum+=num[i];
        	dap+=sum;
        	
        }
        System.out.println(dap);
    }
}


