import java.util.*;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(char c : control.toCharArray()) {
            switch(c) {
                case 'w' : n += 1; break;
                case 's' : n -= 1; break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
        }
        
//         Map<Character, Integer> map = new HashMap<>();

//         for(Character c : control.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         answer = map.getOrDefault('w', 0) + (map.getOrDefault('s', 0) * -1) + (map.getOrDefault('d', 0) * 10) + (map.getOrDefault('a', 0) * -10);
        
        return n;
    }
}