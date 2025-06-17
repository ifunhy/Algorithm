import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> pocketmon = new HashMap<>(N);
        String[] numToName = new String[N + 1];

        for (int i = 0; i < (N); i++) {
            String name = br.readLine();
            pocketmon.put(name, i + 1);
            numToName[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        while (M-- > 0) {
            String str = br.readLine();

            if (Character.isDigit(str.charAt(0))) {
                int index = Integer.parseInt(str);
                sb.append(numToName[index - 1]);
            }
            else sb.append(pocketmon.get(str));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}