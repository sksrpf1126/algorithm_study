class Solution {
    public String solution(String code) {
        
        int mode = 0;
        String answer = "";
        
        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            
            // mode change
            if(mode == 0 && c == '1') {
                mode = 1;
                continue;
            }else if(mode == 1 && c == '1') {
                mode = 0;
                continue;
            }else if(c =='0' || c == '1') continue;
            
            if(mode == 0 && i % 2 == 0) answer += c;
            else if(mode == 1 && i % 2 != 0) answer += c;
            
        }
        return answer.length() != 0 ? answer : "EMPTY";
    }
}