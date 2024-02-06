class Solution {
    public int solution(String number) {
        int total = 0;
        
        for(char c : number.toCharArray()) {
            total += c - 48;
        }
        
        return total % 9;
    }
}