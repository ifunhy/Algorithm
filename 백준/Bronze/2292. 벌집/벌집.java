import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int count = 1;
        int i = 2;

        if (N == count)
            System.out.println("1");
        else
        {
            while (i <= N)
            {
                i = i + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}