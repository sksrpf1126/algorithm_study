import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int first = firstIdxSearch(arr, 2);
        int end = endIdxSearch(arr, 2);
        
        if(first == -1 || end == -1) answer = new int[]{-1};
        else answer = Arrays.copyOfRange(arr, first, end + 1);
        
        return answer;
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