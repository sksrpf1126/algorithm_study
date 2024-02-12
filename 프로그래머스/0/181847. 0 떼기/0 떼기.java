class Solution {
    public String solution(String n_str) {

        int startIdx = -1;
        
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) != '0') break;
            
            startIdx = i + 1; // 0이 있는 인덱스의 다음부터 짤라야 하므로 +1
        }
        
        return startIdx != -1 ? n_str.substring(startIdx) : n_str;
    }
}