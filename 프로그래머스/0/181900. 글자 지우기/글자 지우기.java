import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int value : indices) {
            sb.setCharAt(value, ' ');
        }
        
        return sb.toString().replaceAll(" ", "");
    }
}