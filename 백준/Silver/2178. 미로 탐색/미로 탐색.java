import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {
    static int N;
    static int M;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String nextLine = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = nextLine.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(miro[N - 1][M - 1]);
    }

    static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M)
                    continue;

                if (miro[nextX][nextY] == 0)
                    continue;
                
                if (visited[nextX][nextY])
                    continue;

                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;

                miro[nextX][nextY] = miro[point.x][point.y] + 1;
            }
        }
    }
}