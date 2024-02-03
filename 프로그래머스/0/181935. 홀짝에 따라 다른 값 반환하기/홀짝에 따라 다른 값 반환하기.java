class Solution {
    public int solution(int n) {
        int startNumber = n % 2 == 0 ? 0 : 1;
        int answer = 0;
        
        for(int i = startNumber; i <= n; i = i + 2) {
            if(startNumber == 0) answer += Math.pow(i,2);
            else answer += i;
        }
        
        return answer;
    }
}