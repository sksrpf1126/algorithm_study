import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {

        Integer[] emergencySort = new Integer[emergency.length];

        for(int i = 0; i < emergency.length; i++) {
            emergencySort[i] = emergency[i];
        }

        Arrays.sort(emergencySort, (i1, i2) -> {
            return i2 - i1;
        });

        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergencySort.length; j++) {
                if(emergency[i] == emergencySort[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}