import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    int[] num = new int[n];
    for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
