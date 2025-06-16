import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length;
        
        Set<Integer> distinctSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            distinctSet.add(nums[i]);
        }
        
        int distinctCount = distinctSet.size();
        int maxPick = N / 2;
        return (Math.min(distinctCount, maxPick));
    }
}