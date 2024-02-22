class Solution {
    public int[] solution(int[] num_list) {
        
        int lt = 0, rt = num_list.length - 1;
        
        while(lt < rt) {
            int temp = num_list[lt];
            num_list[lt] = num_list[rt];
            num_list[rt] = temp;
            
            lt++;
            rt--;
        }
        
        return num_list;
    }
}