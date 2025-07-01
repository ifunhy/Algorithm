import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = new int[]{-1,1,0,0};
        int[] dy = new int[]{0,0,1,-1};
        boolean[][] visited  = new boolean[maps.length][maps[0].length];
        Queue<List<Integer>> myQueue = new LinkedList<>();
        myQueue.add(Arrays.asList(0,0,1));

        visited[0][0] = true;

        while (!myQueue.isEmpty()) {
            List<Integer> temp = myQueue.poll();
            int x = temp.get(0);
            int y = temp.get(1);
            int distance = temp.get(2);

            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return (distance);
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if ((0 <= nx && nx < maps.length) && (0 <= ny && ny < maps[0].length)) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                         visited[nx][ny] = true;
                         myQueue.add(Arrays.asList(nx,ny,distance + 1));
                    }
                }
            }
        }
        return (-1);
    }
}