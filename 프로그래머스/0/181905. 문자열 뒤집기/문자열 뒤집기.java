class Solution {
    public String solution(String my_string, int s, int e) {
        return my_string.substring(0, s) + reverseString(my_string.substring(s, e + 1)) + my_string.substring(e + 1);
    }
    
    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        
        return sb.reverse().toString();
    }
    
}