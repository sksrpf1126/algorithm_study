import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
//         int[] answer = {};
//         int[] temp = {};
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<query.length; i++){
//             if(query[i]%2==0 && i ==0){
//                temp = Arrays.copyOfRange(arr,0,query[i]+1);
              
//             }else if(query[i]%2==1 && i ==1){
//                 temp = Arrays.copyOfRange(arr,query[i],arr.length);                
//             }else if(query[i]%2==0&& i !=0){
//                 temp = Arrays.copyOfRange(temp,0,query[i]+1);
                
//             }else if(query[i]%2==1 && i !=1){
//                 temp = Arrays.copyOfRange(temp,query[i],arr.length);
            
//             }
//         }
//         return temp;

        int[] answer = {};
        
        answer = Arrays.copyOfRange(arr, 0, query[0] + 1);
        
        for(int i = 1; i < query.length; i++) {
            if(i % 2 == 0) {
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            }else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        
        return answer;
    }
}