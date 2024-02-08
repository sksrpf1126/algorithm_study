class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length - 1) / 5 + 1];
        
        int answerIdx = 0;
        
        for(int i = 0; i < names.length; i += 5) answer[answerIdx++] = names[i];
        
        return answer;
    }
}