import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            int[] sides = {a,b,c};
            Arrays.sort(sides);

            if ((sides[0]*sides[0]) + (sides[1]*sides[1]) == (sides[2]*sides[2]))
                sb.append("right\n");
            else sb.append("wrong\n");
        }
        System.out.println(sb);
    }
}