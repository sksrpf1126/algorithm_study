import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] arrAfter = Arrays.copyOfRange(arr, 0, arr.length);
        
        while(true) {
            
            // arr(x + 1) 배열 만들기
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) arrAfter[i] = arr[i] / 2;
                else if(arr[i] < 50 && arr[i] % 2 != 0) arrAfter[i] = arr[i] * 2 + 1;
            }
            
            int equalsCount = 0;
            
            // arr(x) == arr(x + 1) 인지 비교
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != arrAfter[i]) break; //값이 다른 인덱스를 만났다면 비교를 멈춤
                
                equalsCount++;
            }
            
            if(equalsCount == arr.length) break; // 모든 값이 같다면 while문 탈출
            
            arr = Arrays.copyOfRange(arrAfter, 0, arrAfter.length);
            
            answer++; //탈출을 못했다면 x에 해당하는 값 증가
        }
        
        return answer;
    }
}