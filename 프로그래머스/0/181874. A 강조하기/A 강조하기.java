class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()) {
            if(c == 'a') answer += (char) (c - 32);
            else if(c >= 65 && c <= 97 && c != 'A') answer += (char) (c + 32);
            else answer += c;
        }
        
        return answer;
    }
}