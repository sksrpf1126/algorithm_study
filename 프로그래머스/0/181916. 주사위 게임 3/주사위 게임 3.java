import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] numbers = new int[7];
        numbers[a] += 1;
        numbers[b] += 1;
        numbers[c] += 1;
        numbers[d] += 1;

        int answer = 0, p = 0, q = 0, r = 0;
        int maxNum = Arrays.stream(numbers).max().getAsInt();

        if (maxNum == 4) {          
            answer = 1111 * a;
        } else if (maxNum == 3) {   
            for (int idx = 0; idx < numbers.length; idx++) {
                if (numbers[idx] == 3) {
                    p = idx;
                } else if (numbers[idx] == 1){
                    q = idx;
                }
                answer = (int) Math.pow(10 * p + q, 2);
            }
        } else if (maxNum == 2) {
            boolean contains = Arrays.stream(numbers).anyMatch(num -> num == 1);
            if (contains) {
                for (int idx = 0; idx < numbers.length; idx++) {
                    if (numbers[idx] == 1) {
                        if (q == 0) {
                            q = idx;
                        } else {
                            r = idx;
                        }
                    }
                }
                answer = q * r;
            } else {                // 주사위가 두 개씩 같은 값이 나온 경우
                for (int idx = 0; idx < numbers.length; idx++) {
                    if (numbers[idx] == 2) {
                        if (p == 0) {
                            p = idx;
                        } else {
                            q = idx;
                        }
                    }
                }
                answer = (p + q) * (Math.abs(p - q));
            }
        } else {                    // 네 주사위에 적힌 숫자가 모두 다른 경우
            for (int idx = 0; idx < numbers.length; idx++) {
                if (numbers[idx] > 0) {
                    answer = idx;
                    break;
                }
            }
        }
        return answer;
    }
}