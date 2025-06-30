import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k)
                pq.offer(score[i]);
            else {
                if (pq.peek() < score[i]) {
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            result[i] = pq.peek();
        }
        return (result);
    }
}