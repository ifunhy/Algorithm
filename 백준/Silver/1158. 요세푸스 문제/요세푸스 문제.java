import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> q = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int temp = K - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!q.isEmpty()) {
            temp %= q.size();
            sb.append(q.get(temp));
            q.remove(temp);

            if (!q.isEmpty()) {
                sb.append(", ");
                temp += K - 1;
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}