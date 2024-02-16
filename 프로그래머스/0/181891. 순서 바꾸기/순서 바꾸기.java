class Solution {
    public int[] solution(int[] num_list, int n) {
 int[] answer = new int[num_list.length];
        int t=0;  
        int temp = n;
            for(int i = 0; i< num_list.length-n; i++){
                answer[i] = num_list[temp++];
            }
        if(n != 1){
         for(int i = num_list.length-n; i< num_list.length; i++){
                answer[i] = num_list[t++];
            }
        }else if(n==1){
            for(int i = num_list.length-n; i< num_list.length; i++){
                answer[i] = num_list[t++];
            }
        }
        return answer;

        
        //         int[] answer = new int[num_list.length];
        
//         int idx = 0;
        
//         for(int i = n; i < num_list.length; i++) {
//             answer[idx++] = num_list[i];
//         }
        
//         for(int i = 0; i < n; i++) {
//             answer[idx++] = num_list[i];
//         }
        
//         return answer;
    }
}