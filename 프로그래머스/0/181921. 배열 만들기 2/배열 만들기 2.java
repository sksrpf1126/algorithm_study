import java.util.*;
import java.util.stream.*;

class Solution {
    
    public static int L, R;
    
    public int[] solution(int l, int r) {
        int[] answer;
        
        L = l;
        R = r;
        List<Integer> list = new ArrayList<>();

        fiveZero(list, "5");

        if(list.size() == 0) answer = new int[]{-1};
        else {
            answer = list.stream().mapToInt((value) -> (int) value).toArray();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    public static void fiveZero(List<Integer> listCopy, String start) {

        if(Integer.parseInt(start) > R) return;
        else if(Integer.parseInt(start)  >= L && Integer.parseInt(start) <= R) listCopy.add(Integer.valueOf(start));

        fiveZero(listCopy, start + "0");
        fiveZero(listCopy, start + "5");
        
    }
    
}