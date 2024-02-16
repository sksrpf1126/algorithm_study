import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
                int[] answer = {};
        int a =  slicer[0];
        int b =  slicer[1];
        int c =  slicer[2];
        ArrayList<Integer> list = new ArrayList<>();
        switch(n){
            case 1 : answer = Arrays.copyOfRange(num_list,0,b+1);
                     break;
                    
            case 2 : answer = Arrays.copyOfRange(num_list,a,num_list.length);
                     break;
                
            case 3 :answer = Arrays.copyOfRange(num_list,a,b+1);
                     break;
                
            case 4 : for(int i = a; i < b + 1 ; i += c){
                      list.add(num_list[i]);
                          }
                //새로 정의하지 않고 그냥 new int[]만 해서 배열 크기 선언 가능
                answer = new int[list.size()];
                for(int i=0;i<list.size();i++){
                    answer[i]=list.get(i);
                }
                break;
        }
        return answer;
//         int[] answer = {};
        
//         switch(n) {
//             case 1: answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1); break;
//             case 2: answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length); break;
//             case 3: answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1); break;
//             case 4: 
//                 List<Integer> list = new ArrayList<>();
                
//                 for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
//                     list.add(num_list[i]);
//                 } 
                
//                 answer = list.stream().mapToInt((v) -> v).toArray();
//         }
        
//         return answer;
    }
}