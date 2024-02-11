import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        //Key -> 문자열 길이, value -> 개수 (Map대신 배열로도 가능)
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
        }
        
        return map.values().stream().mapToInt((v) -> v).max().orElse(0);
    }
}