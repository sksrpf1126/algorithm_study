import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        return IntStream.rangeClosed(end_num, start).boxed().sorted(Collections.reverseOrder()).mapToInt(value -> value).toArray();
    }
}