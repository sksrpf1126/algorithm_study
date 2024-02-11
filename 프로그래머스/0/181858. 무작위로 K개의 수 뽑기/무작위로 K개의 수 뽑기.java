import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer;
        
        Set<Integer> set = new LinkedHashSet<>();
        
        for(int num : arr) {
            if(set.size() < k) set.add(num);
        }
        
        List<Integer> list = set.stream().collect(Collectors.toList());
        
        for(int i = 0; i < k - set.size(); i++) {
            list.add(-1);
        }
        
        return list.stream().mapToInt((v) -> v).toArray();
    }
}