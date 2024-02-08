import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        
        String targetString = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(c == ' ' && targetString.length() != 0) {
                list.add(targetString);
                targetString = "";
            } else if(c != ' ') targetString += c;
            
        }
        
        if(targetString.length() > 0) list.add(targetString);
        
        return list.toArray(new String[list.size()]);
    }
}