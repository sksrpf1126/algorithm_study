import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] counting = new int[1000];
        int answer;
        
        for(int number : array) {
            counting[number]++;
        }
        
        int max = Arrays.stream(counting).max().getAsInt();
        
        int duplicate = 0;
        int target = 0;
        
        for(int i = 0; i < counting.length; i++) {
            if(duplicate > 1) break;
            
            if(counting[i] == max) {
                target = i;
                duplicate++;
            }
        }
        
        return duplicate > 1 ? -1 : target;
    }
}