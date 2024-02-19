import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        
        return  factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
        
    }
    
    public static BigInteger factorial(int n) {
        if(n <= 1) return BigInteger.valueOf(1);
        else return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

}