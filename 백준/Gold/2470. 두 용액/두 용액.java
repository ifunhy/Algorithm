import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        int total;
        Map<String, Integer> map = new HashMap<>();

        while (start < end && end <= arr.length) {
            int sum = arr[start] + arr[end];
            total = Math.abs(sum);

            map.put(arr[start] + " " + arr[end], total);

            if (sum > 0) {
                end--;
            } else {
                start++;
            }
        }

        Integer minValue = Collections.min(map.values());
        
        for (String key : map.keySet()) {
            if (map.get(key) == minValue) {
                System.out.println(key);
                break;
            }
        }
    }
}