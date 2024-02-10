import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> list = new ArrayList<>();
        
        for(String str : strArr) {
            if(str.contains("ad")) continue;
            
            list.add(str);
        }
        
        return list.stream().toArray(String[] :: new);
    }
}