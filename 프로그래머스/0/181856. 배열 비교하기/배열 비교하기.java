import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        //길이가 다를 경우 비교 후 return
        if(arr1.length != arr2.length) return arr1.length > arr2.length ? 1 : -1;
        
        //길이가 같다면 실행될 코드
        int sumArr1 = Arrays.stream(arr1).sum();
        int sumArr2 = Arrays.stream(arr2).sum();
        
        if(sumArr1 > sumArr2) return 1;
        else if(sumArr1 < sumArr2) return -1;
        else return 0;
    }
}