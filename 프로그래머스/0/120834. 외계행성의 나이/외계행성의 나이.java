class Solution {
    public String solution(int age) {
        String answer = "";
        
        String ageString = age + "";
        
        for(char c : ageString.toCharArray()) {
            answer += (char) (c + 49);
        }
        
        return answer;
    }
}