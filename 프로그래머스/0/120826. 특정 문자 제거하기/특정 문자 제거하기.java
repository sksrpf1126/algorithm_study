class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for(char c : my_string.toCharArray()) {
            if((c + "").equals(letter)) continue;
            answer += c;
        }
        
        return answer;
    }
}