import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int div = gcd(A, B);
        
        System.out.println(div);
        System.out.println(A * B / div);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}