import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (o1,o2) -> {
            if (o1[1] ==o2[1]) {
                return (o1[0] - o2[0]);
            }
            return (o1[1] - o2[1]);
        });

        int count = 0;
        int end = 0;

        for (int i = 0; i < time.length; i++) {
            if (end <= time[i][0]) {
                count++;
                end = time[i][1];
            }
        }

        System.out.println(count);
    }
}