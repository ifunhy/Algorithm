import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        Queue<Integer> q = new PriorityQueue();

        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }

        int count = 0;

        while (q.size() > 1 && q.peek() < K) {
            int a = q.poll();
            int b = q.poll();
            q.add(a + (b * 2));
            count++;
        }
        
        if (q.peek() < K)
            return (-1);
        else return (count);
    }
}