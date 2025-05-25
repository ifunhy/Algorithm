import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;

        for (int i = Math.max(1, N - 9 * String.valueOf(N).length()); i < N; i++)
        {
            int sum = i;
            int temp = i;

            while (temp > 0)
            {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N)
            {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}