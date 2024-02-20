class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int temp = slice;
        
        while(slice < n) {
            slice += temp;
            answer++;
        }
        
        return answer;
    }
}