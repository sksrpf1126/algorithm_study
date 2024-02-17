import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        
        int resultDenom = denom1 * denom2;
        int resultNumber = numer1 + numer2;
        
        
        int gcdNumber = gcd(Math.max(resultDenom, resultNumber), Math.min(resultDenom, resultNumber));
        
        if(gcdNumber == -1) {
            answer[0] = resultNumber;
            answer[1] = resultDenom;
        }else {
            answer[0] =  resultNumber / gcdNumber;
            answer[1] = resultDenom / gcdNumber;
        }

        
        return answer;
    }
    
    public static int gcd(int A, int B) {

        while (B != 0) {
            int r = A % B;
            A = B;
            B = r;
        }

        return A;

    }
}