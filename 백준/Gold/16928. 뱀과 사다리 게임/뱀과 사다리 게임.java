import java.io.*;
import java.util.*;

public class Main {
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new int[101];
        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }

        int result = bfs(1);
        System.out.println(result);
    }

    private static int bfs(int startNode) {
        int[] check = new int[101];
        Queue<Integer> q = new LinkedList<>();

        q.offer(startNode);
        check[startNode] = 0;

        while (!q.isEmpty()) {
            int visitedNum = q.poll();
            
            for (int i = 1; i <= 6; i++) {
                int newNode = visitedNum + i;

                if (newNode > 100) continue;

                int next = board[newNode];

                if (check[next] == 0) {
                    q.offer(next);
                    check[next] = check[visitedNum] + 1;

                    if (next == 100) {
                        return check[100];
                    }
                }
            }
        }
        return -1;
    }
}