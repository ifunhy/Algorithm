class Solution {
    public String solution(String s) {
        String answer = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 1) {
                n = s.length() / 2;
                answer = s.substring(n, n+1);
            }
            else if (s.length() % 2 == 0) {
                n = s.length() / 2;
                answer = s.substring(n-1, n+1);
            }
        }
        return answer;
    }
}