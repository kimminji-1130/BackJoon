import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 0;
		String[] a = new String[n];
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < n + m; i++) {
			li.add(sc.nextLine());
		}
		List<String> distinctLi = li.stream().distinct().collect(Collectors.toList());
		for (String distinctElement : distinctLi) {
			li.remove(distinctElement);
		}
		Collections.sort(li, String.CASE_INSENSITIVE_ORDER);
		System.out.println(li.size());
		li.stream().forEach(System.out::println);
	}
}