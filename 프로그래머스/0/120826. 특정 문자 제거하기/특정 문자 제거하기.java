class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        // for (int i = 0; i < my_string.length(); i++) {
        //     answer = my_string.replace(letter, "");
        // }
        // return answer;
        for (int i = 0; i < my_string.length(); i++) {
            if (!my_string.substring(i, i + 1).equals(letter)) {
                answer += my_string.substring(i, i + 1);
            }
        }
        return (answer);
    }
}