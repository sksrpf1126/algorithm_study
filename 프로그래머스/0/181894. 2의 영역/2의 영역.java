import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        //2가 들어가는 idx 추출해서 list에 넣기
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                list.add(i);
            } 
            //list 첫번째, 끝 idx로 배열값 복사 
        }
        if(list.size() == 0) answer = new int[]{-1};
        else {
            answer = Arrays.copyOfRange(arr,list.get(0),list.get(list.size() - 1) + 1);
        }
    
        return answer;
//         int[] answer = {};
        
//         int first = firstIdxSearch(arr, 2);
//         int end = endIdxSearch(arr, 2);
        
//         if(first == -1 || end == -1) answer = new int[]{-1};
//         else answer = Arrays.copyOfRange(arr, first, end + 1);
        
//         return answer;
    }
    
    public static int firstIdxSearch(int[] arr, int value) {
        int idx = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                idx = i;
                break;
            }
        }
        
        return idx;
    } //firstIdxSearch method end 
    
    public static int endIdxSearch(int[] arr, int value) {
        int idx = -1;
        
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == value) {
                idx = i;
                break;
            }
        }
        
        return idx;
    }
    
}