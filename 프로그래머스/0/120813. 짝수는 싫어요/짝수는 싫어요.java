import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i+=2) {
            list.add(i);
        }
        
        answer = list.stream().mapToInt((v) -> v).toArray(); 
        
        return answer;
    }
}