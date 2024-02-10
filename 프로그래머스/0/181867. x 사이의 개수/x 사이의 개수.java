import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        List<Integer> list = new ArrayList<>();
        
        int count = 0;
        
        for(char c : myString.toCharArray()) {
            if(c == 'x') {
                list.add(count);
                count = 0;
            } else count++;
        }
        
        list.add(count); //마지막 값 추가
        
        return list.stream().mapToInt((v) -> v).toArray();
    }
}