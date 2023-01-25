import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        String[] word = new String[n];

        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next();
            word[i] = word[i].toLowerCase();
        }

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else if(o1.length() == o2.length()) return 0;
                else return -1;
            }
        });
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if(word[i].length() != word[j].length()) break;
            }
            Arrays.sort(word, i,j);
            i = j-1;
        }
        
        System.out.println(word[0]);
        for (int i = 1; i < n; i++) {
            if(word[i-1].equals(word[i])) continue;
            System.out.println(word[i]);
        }
    }
}


