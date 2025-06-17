import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String name = null;

        for (int i = 0; i < N; i++) {
            name = br.readLine();
            map.put(name, i + 1);
        }

        for (int i = 0; i < M; i++) {
            name = br.readLine();
            if (map.containsKey(name)) {
                set.add(name);
            }
        }
        count = set.size();

        System.out.println(count);

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        
        for (String s : list) {
            System.out.println(s);
        }
    }
}