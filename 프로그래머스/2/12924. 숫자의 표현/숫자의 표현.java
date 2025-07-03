class Solution {
    public int solution(int n) {
        int start = 1;
        int end = start;
        int total = 1;
        int count = 0;

        while (start <= end && end <= n) {
            if (total == n) {
                count++;
                end++;
                total += end;
            } else if (total < n) {
                end++;
                total += end;
            } else {
                total -= start;
                start++;
            }
        }
        return (count);
    }
}