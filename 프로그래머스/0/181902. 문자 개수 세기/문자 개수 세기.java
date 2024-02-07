class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)) answer[(char) (c - 65)]++;
            else answer[(char) (c - 97 + 26)]++;
        }
            
        return answer;
    }
}