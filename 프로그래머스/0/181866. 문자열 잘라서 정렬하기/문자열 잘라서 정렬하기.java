import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> list = new ArrayList<>();
        
        String strTemp = "";
        
        for(char c : myString.toCharArray()) {
            if(c == 'x') {
                if(strTemp.length() == 0) continue;
                list.add(strTemp);
                strTemp = "";
            } else {
                strTemp += c;
            }
        }
        
        if(strTemp.length() != 0) list.add(strTemp);
        
        return list.stream().sorted().toArray(String[] :: new);
    }
}