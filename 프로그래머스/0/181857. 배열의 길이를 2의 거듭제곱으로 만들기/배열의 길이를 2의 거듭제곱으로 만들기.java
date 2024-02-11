import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int twoSquare = 1;
        
        while(twoSquare < arr.length) twoSquare *= 2;
        
        int[] answer = Arrays.copyOfRange(arr, 0, twoSquare);
        
        return answer;
    }
}