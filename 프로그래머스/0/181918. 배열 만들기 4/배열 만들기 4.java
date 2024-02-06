import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        
        List<Integer> list = new ArrayList<>();
        
        
        for(int i = 0; i < arr.length; i++) {
            
            if(list.size() == 0) {
                list.add(arr[i]);
                continue;
            }
            
            int lastNumber = list.get(list.size() - 1);
            
            if(lastNumber < arr[i]) list.add(arr[i]);
            else {
                list.remove(list.size() - 1);
                i--;
            }
        }
        
        stk = list.stream().mapToInt((value) -> value).toArray();
        
        return stk;
    }
}