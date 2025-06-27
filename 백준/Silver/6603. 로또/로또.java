import java.io.*;
import java.util.*;

public class Main {
    static int K;
    static int[] arr;
    static List<Integer> temp = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());

            if (K == 0) break;
            arr = new int[K];

            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int value : temp) {
                sb.append(value).append(" ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
            return;
        }

        if (start >= K) return;

        for (int i = start; i < K; i++) {
            temp.add(arr[i]);
            dfs(i + 1, depth + 1);
            temp.remove(temp.size() - 1);
        }
    }
}