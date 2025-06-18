import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            String url = token.nextToken();
            String password = token.nextToken();
            map.put(url, password);
        }

        StringBuilder sb = new StringBuilder();

        while (M-- > 0) {
            String str  = br.readLine();
            sb.append(map.get(str));
            sb.append("\n");
        }
        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.println(sb);
    }
}