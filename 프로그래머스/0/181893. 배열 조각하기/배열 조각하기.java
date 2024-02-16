import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        int[] answer = arr;
        
        // answer = Arrays.copyOfRange(arr, 0, query[0] + 1);
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            }else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        
        return answer;
    }
}