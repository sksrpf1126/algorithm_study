class Solution {
    public int solution(int n, int k) {
        int sales = n / 10;
        
        int answer = (n * 12000) + (k * 2000) - (sales * 2000);
        
        return answer;
    }
}