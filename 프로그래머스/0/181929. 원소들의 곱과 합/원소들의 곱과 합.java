import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        
        int multiply = Arrays.stream(num_list).reduce(1, (oldValue, newValue) -> oldValue *= newValue);
        int sumPow = (int) Math.pow(Arrays.stream(num_list).sum(), 2);
        
        return multiply < sumPow ? 1 : 0;
    }
}