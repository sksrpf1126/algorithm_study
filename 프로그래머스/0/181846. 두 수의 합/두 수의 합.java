import java.util.*;

class Solution {
    public String solution(String a, String b) {
        
        //한자릿수 + 한자릿수는 최대 두자릿수밖에 되지 않음
        //문제에서 10만자리 + 10만자리가 최대이므로 100001의 자릿수가 최대
        int[] arr = new int[100001]; //100001 자리 할당

        int idx = 0;

        //arr배열의 맨 뒤부터 숫자 채우기
        for(int i = a.length() - 1; i >= 0; i--) {
            arr[(arr.length - 1) - idx++] = a.charAt(i) - 48;
        }

        idx = 0;


        for(int i = b.length() - 1; i >= 0; i--) {
            //arr에 들어있는 각 자릿수의 숫자들과 b에 들어있는 각 자릿수의 수 더하기
            arr[(arr.length - 1) - idx] += b.charAt(i) - 48;

            //현재 자릿수의 숫자가 10 이상이라면 다음 자릿수의 값을 +1
            if(arr[(arr.length - 1) - idx] >= 10) {
                arr[(arr.length - 1) - idx] -= 10;
                arr[(arr.length - 1) - idx - 1] += 1;
            }

            //arr배열의 인덱스를 앞으로 한칸 옮기기
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        
        int len = a.length() >= b.length() ? a.length() : b.length();

        for(int i = arr.length - 1; i >= arr.length - (len + 1); i--) {
            sb.append(arr[i]);
        }
        
        String answer = sb.reverse().toString();
        
        if(answer.charAt(0) == '0') answer = answer.substring(1);

        return answer;
    }
}