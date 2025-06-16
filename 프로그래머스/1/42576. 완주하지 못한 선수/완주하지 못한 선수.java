import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> players = new HashMap<>();
        Map<String, Integer> remove = new HashMap<>();

         // 1) 참가자 수 세기
         for (String p : participant) {
         players.put(p, players.getOrDefault(p, 0) + 1);
         }
        
         // 2) 완주자 수만큼 빼기
         for (String r : completion) {
         players.put(r, players.get(r) - 1);
         }
        
         // 3) 남은(완주하지 못한) 선수 찾기
         for (Map.Entry<String,Integer> e : players.entrySet()) {
             if (e.getValue() > 0) {
                 answer = e.getKey();
                 break;
             }
         }
        return answer;
    }
}