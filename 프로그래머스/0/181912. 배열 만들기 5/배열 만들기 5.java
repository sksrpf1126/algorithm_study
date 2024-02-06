import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(String str : intStrs) {
            int currentValue = Integer.parseInt(str.substring(s, s + l));
            
            if(currentValue > k) list.add(currentValue);
        }
        
        return list.stream().mapToInt(value -> value).toArray();
    }
}