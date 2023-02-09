import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int length = str.length();

			for (int j = 0; j < length; j++) {
				char ch = str.charAt(j);

				if (ch == '(') {
					stack.push(ch);
				} else {
					int size = stack.size();
					if (size == 0) {
						stack.push(ch);
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			stack.clear();
		}
	}
}