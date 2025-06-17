import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if(stack.size() == 0 || stack.peek() != num) {
                stack.push(num);
            }
        }
        
        int size = stack.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = stack.get(i);
        }
        
        return (answer);
    }
}