class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int currentTargetIdx = pat.length() - 1;
        int endIdx = -1;
        
        for(int i = myString.length() - 1; i >= 0; i--) {
            char c = myString.charAt(i);
            
            c = c == 'A' ? 'B' : 'A';
            
            if(c == pat.charAt(currentTargetIdx)) {
                if(endIdx == -1) endIdx = i; //처음으로 패턴의 끝과 일치하면 끝의 인덱스 저장
                
                if(currentTargetIdx == 0) {
                    answer = 1;
                    break; //맨 처음 패턴까지 일치했다면 반복문 종료
                }
                currentTargetIdx--;
            }else {
                endIdx = -1; //패턴이 일치하지 않았다면 다시 -1
            }
        }
        
        return answer;
    }
}