import java.io.*;
import java.util.*;

public class Main {
    static int[] dx;
    static int[] dy;
    static String[][] arr = new String[5][5];
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dx = new int[]{-1, 1, 0, 0};
        dy = new int[]{0, 0, 1, -1};

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] =st.nextToken();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, arr[i][j]);
            }
        }
        System.out.println(set.size());

    }

    static void dfs(int x, int y, int count, String xy) {
        if (count == 5) {
            set.add(xy);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
                continue;
            }

            dfs(nx, ny, count + 1, xy + arr[nx][ny]);
        }
    }
}