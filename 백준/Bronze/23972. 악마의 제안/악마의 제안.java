import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long K = Long.parseLong(st.nextToken());
        Long N = Long.parseLong(st.nextToken());

        // (M - N) * K = M
        // (가진돈 - 지불할돈) * 배수 = 가진돈
        // M = (K*N)/(K-1)
        Long result = -1L;
        if (N != 1L) {
            result = (K * N) / (N - 1L);

            if ((K * N) % (N - 1L) != 0L) {
                result += 1L;
            }

        }

        System.out.print(result);

    }
}