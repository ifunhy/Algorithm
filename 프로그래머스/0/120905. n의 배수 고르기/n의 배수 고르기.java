import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
                List<Integer> list = new ArrayList<>();

        for(int i : numlist) {
            if (i % n == 0)
                list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}