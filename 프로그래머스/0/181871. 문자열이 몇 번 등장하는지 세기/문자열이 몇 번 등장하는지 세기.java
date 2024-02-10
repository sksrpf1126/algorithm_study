class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int currentTargetIdx = pat.length() - 1;
        int endIdx = -1;
        
        for(int i = myString.length() - 1; i >= 0; i--) {
            char c = myString.charAt(i);
            
            if(c == pat.charAt(currentTargetIdx)) {
                if(endIdx == -1) endIdx = i; //처음으로 패턴의 끝과 일치하면 끝의 인덱스 저장
                
                //패턴이 일치했다면 answer 증가 및 현재패턴의 위치를 마지막으로 다시 초기화
                //패턴의 끝 인덱스(endIdx)의 한칸 앞에서부터 다시 검증하기 위해 i의 인덱스 값을 endIdx값으로 변경
                if(currentTargetIdx == 0) {
                    answer++;
                    currentTargetIdx = pat.length() - 1;
                    i = endIdx;
                    endIdx = -1;
                    continue;
                }
                
                currentTargetIdx--;
            }else {
                if(endIdx != -1) i = endIdx;
                endIdx = -1; //패턴이 일치하지 않았다면 다시 -1
                currentTargetIdx = pat.length() - 1; //패턴 비교 인덱스 또한 초기화
            }
        }
        
        return answer;
    }
}