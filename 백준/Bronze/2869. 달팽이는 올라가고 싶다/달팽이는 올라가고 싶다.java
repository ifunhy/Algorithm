import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(s.nextToken());
        int down = Integer.parseInt(s.nextToken());
        int len = Integer.parseInt(s.nextToken());
        
        int count = (len - down) / (up - down);
        
        if ((len - down) % (up - down) != 0)
            count++;

        System.out.println(count);
    }
}