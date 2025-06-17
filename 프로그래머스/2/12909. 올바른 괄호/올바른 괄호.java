class Solution {
    boolean solution(String s) {
        int valid = 0;                       // 현재 열린 괄호의 개수

        for (char c : s.toCharArray()) {    // 문자열을 한 글자씩 순회
            if (c == '(') {
                valid++;                     // 열린 괄호 하나 추가
            } else if (c == ')') {
                if (valid == 0) {            // 닫힌 괄호가 더 많아지면 즉시 false
                    return false;
                }
                valid--;                     // 열린 괄호 하나 소모
            }
        }
        return (valid == 0);                // 모든 열린 괄호가 닫혔는지 확인
    }
}