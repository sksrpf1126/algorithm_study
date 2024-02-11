import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        
        String currentString = "";
        
        for(char c : myStr.toCharArray()) {
            if(c == 'a' || c == 'b' || c == 'c') {
                if(currentString.length() != 0) {
                    list.add(currentString);
                    currentString = "";
                }
            }else {
                currentString += c;
            }
        }
        
        if(currentString.length() > 0) list.add(currentString);
        
        if(list.size() == 0) list.add("EMPTY");
        
        return list.stream().toArray(String[] :: new);
    }
}