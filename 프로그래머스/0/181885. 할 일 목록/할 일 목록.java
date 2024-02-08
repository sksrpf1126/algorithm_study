import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int falseCount = 0;
        
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) falseCount++;
        }
        
        String[] answer = new String[falseCount];
        
        int answerIdx = 0;
        
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) answer[answerIdx++] = todo_list[i];
        }
        
        return answer;
    }
}