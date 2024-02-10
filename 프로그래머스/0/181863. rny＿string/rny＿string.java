class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(char c : rny_string.toCharArray()) {
            answer += c == 'm' ? "rn" : c;
        }
        
        return answer;
    }
}