import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] moneyArr = new Integer[N];

        for (int i = 0; i < N; i++) {
            moneyArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(moneyArr,Comparator.reverseOrder());

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (moneyArr[i] <= K) {
                count += K / moneyArr[i];
                K %= moneyArr[i];
            }
        }
        System.out.println(count);
    }
}