import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int importance = Integer.parseInt(st.nextToken());
                q.add(new int[]{j, importance});
            }

            int count = 0;

            while (true) {
                int[] cur = q.poll();
                boolean check = true;

                for (int[] other : q) {
                    if (other[1] > cur[1]) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    count++;
                    if (cur[0] == M)
                        break;
                } else
                    q.add(cur);
            }
            System.out.println(count);
        }
    }
}