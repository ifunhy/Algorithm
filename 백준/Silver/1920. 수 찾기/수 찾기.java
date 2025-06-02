import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer stN = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arrN[i] = Integer.parseInt(stN.nextToken());
        Arrays.sort(arrN);      

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(stM.nextToken());
            if (Arrays.binarySearch(arrN, x) >= 0) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}