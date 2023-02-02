# BackJoon
This is a auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).
[![Solved.ac Profile](http://mazassumnida.wtf/api/v2/generate_badge?boj=ddaa63777)](https://solved.ac/ddaa63777/)

``` JAVA
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
'''
```
import java.util.*;


public class da {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		boolean c= false;
		String a="";
		for(int i=1;i<=n;i++) {
			a+=i;
		}
		while(a.length()!=1) {
			String b=a.substring(0,1);
			a=a.substring(1);
			if(c==true)	{a+=b; c=false; continue;}
			c=true;
		}
		System.out.println(a);
	}
	}

```
