import java.util.*;
 
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
    	if(a.contains("A+")) {
    		System.out.println("4.3");
    	} else if(a.contains("A0")) {
    		System.out.println("4.0");
    	} else if(a.contains("A-")) {
    		System.out.println("3.7");
    	} else if(a.contains("B+")) {
    		System.out.println("3.3");
    	} else if(a.contains("B0")) {
    		System.out.println("3.0");
    	} else if(a.contains("B-")) {
    		System.out.println("2.7");
    	}else if(a.contains("C+")) {
    		System.out.println("2.3");
    	} else if(a.contains("C0")) {
    		System.out.println("2.0");
    	} else if(a.contains("C-")) {
    		System.out.println("1.7");
    	} else if(a.contains("D+")) {
    		System.out.println("1.3");
    	} else if(a.contains("D0")) {
    		System.out.println("1.0");
    	} else if(a.contains("D-")) {
    		System.out.println("0.7");
    	} else {
    		System.out.println("0.0");
    	}
    	
    }
}