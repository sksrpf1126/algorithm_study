class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int current = a;
        int answer = 0;

        for(boolean flag : included) {
            if(flag) answer += current;

            current += d;
        }
        
        return answer;
    }
}