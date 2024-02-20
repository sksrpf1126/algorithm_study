class Solution {
    public int solution(int n) {
        int answer = n / 7;
        n -= answer * 7;
        return n != 0 ? answer + 1 : answer;
    }
}