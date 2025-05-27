import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(s.nextToken());
        int K = Integer.parseInt(s.nextToken());
        int numer = 1;
        int denomin = 1;

        for (int i = 0; i < K; i++)
        {
            numer *= (N - i);
            denomin *= (i + 1);
        }
        System.out.println(numer / denomin);
    }
}