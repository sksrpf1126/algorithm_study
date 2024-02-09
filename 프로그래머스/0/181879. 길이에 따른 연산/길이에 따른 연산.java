class Solution {
    public int solution(int[] num_list) {
        int answer = num_list[0]; // 첫번쨰 값을 미리 할당
        
        for(int i = 1; i < num_list.length; i++) {
            answer = num_list.length >= 11 ? answer + num_list[i] : answer * num_list[i];
        }
        
        return answer;
    }
}