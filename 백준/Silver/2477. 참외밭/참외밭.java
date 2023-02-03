import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
	    int[] array = new int[6];
	    int w = 0;
	    int h = 0;
	    int ww = 0;
	    int hh = 0;
	    for (int i = 0; i < 6; i++) {
	        sc.nextInt();
	        array[i] = sc.nextInt();
	    }
	 
	    for (int i = 0; i < 6; i++) {
	        if (i % 2 == 0) {
	            if (w < array[i]) {
	                w = array[i];
	            }
	        } else {
	            if (h < array[i]) {
	                h = array[i];
	            }
	        }
	    }
	 
	    for (int i = 0; i < 6; i++) {
	        if (i % 2 == 0) {
	            if (h == array[(i + 5) % 6] + array[(i + 1) % 6]) {
	                ww = array[i];
	            }
	        } else {
	            if (w == array[(i + 5) % 6] + array[(i + 1) % 6]) {
	                hh = array[i];
	            }
	        }
	    }
	    System.out.println((w * h - ww * hh) * k);
	}
}