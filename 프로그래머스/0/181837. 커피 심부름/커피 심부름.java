class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String coffee : order) {
            if(coffee.indexOf("americano") != -1) answer += 4500;
            else if(coffee.indexOf("cafelatte") != -1) answer += 5000;
            else answer += 4500;
        }
        
        return answer;
    }
}