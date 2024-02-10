import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] str = binomial.split(" ");
        
        int firstNumber = Integer.parseInt(str[0]);
        int secondNumber = Integer.parseInt(str[2]);
        
        switch(str[1]) {
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "-":
                answer = firstNumber - secondNumber;
                break;
            case "*":
                answer = firstNumber * secondNumber;
                break;
        }
        
        return answer;
    }
}