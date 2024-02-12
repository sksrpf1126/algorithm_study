import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int deleteNumber : delete_list) {
            set.add(deleteNumber);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int arrNumber : arr) {
            if(!set.contains(arrNumber)) list.add(arrNumber);
        }
        
        return list.stream().mapToInt((v) -> v).toArray();
    }
}