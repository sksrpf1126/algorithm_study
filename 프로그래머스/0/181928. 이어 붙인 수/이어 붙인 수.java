class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String even = "";
        String odd = "";
        
        for(int num : num_list) {
            if(num % 2 == 0) even += num;
            else if(num % 2 != 0) odd += num;
        }
        
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}