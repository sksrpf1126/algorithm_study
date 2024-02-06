import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) {
            my_string = my_string.substring(0, queries[i][0]) + reverseString(my_string.substring(queries[i][0], queries[i][1] + 1)) + my_string.substring(queries[i][1] + 1);
        }
        
        return my_string;
    }
    
    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}