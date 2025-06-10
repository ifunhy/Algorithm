import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(x);
            }
        }
        long sum = 0;
        for (int v : list) {
            sum += v;
        }
        System.out.println(sum);
    }
}