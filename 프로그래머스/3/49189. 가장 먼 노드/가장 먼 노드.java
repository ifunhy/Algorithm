import java.util.*;

class Solution {
    public int solution(int n, int[][] vertex) {
        List<List<Integer>> adjList = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < vertex.length; i++) {
            adjList.get(vertex[i][0]).add(vertex[i][1]);
            adjList.get(vertex[i][1]).add(vertex[i][0]);
        }

        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        Queue<Integer> myQueue = new LinkedList<>();
        int[] distance = new int[n + 1];
        myQueue.add(1);
        visited[1] = true;
        List<Integer> count = new ArrayList<>();

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();

            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    myQueue.add(a);
                    visited[a] = true;
                    distance[a] = distance[temp] + 1;
                    count.add(distance[a]);
                }
            }
        }
        count.sort(Comparator.reverseOrder());
        int result = Collections.frequency(count, count.get(0));
        return (result);
    }
}