import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        String[] answer = new String[picture.length * k];
        
        int answerIdx = 0;
        
        for(String pixelString : picture) {
            
            String temp = "";
            
            //행 문자열 생성
            for(int i = 0; i < pixelString.length(); i++) {
                char pixel = pixelString.charAt(i);
                
                for(int j = 0; j < k; j++) {
                    temp += pixel;
                }
            }//행 문자열 생성 끝
            
            //세로 문자열 생성
            for(int i = 0; i < k; i++) {
                answer[answerIdx++] = temp;
            }//세로 문자열 생성 끝
            
        }//바깥 for문 끝
        
        return answer;
    }
}