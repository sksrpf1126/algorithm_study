import java.util.*;



class Solution {
    
    public static int number = 1;
    public static int N = 0;
    
    public int[][] solution(int n) {
        N = n;
        int[][] answer = new int[N][N];
        
        arrayBatch(answer, 0, 0, "우");
        
        return answer;
    }
    
    public static void arrayBatch(int[][] answer, int rowIdx, int columnIdx, String direction) {
        if(number > N * N) return; //재귀함수 탈출 조건

        System.out.println(number);

        switch (direction) {
            case "우" :
                if(columnIdx >= answer[rowIdx].length || answer[rowIdx][columnIdx] != 0) {
                    arrayBatch(answer, rowIdx + 1, columnIdx - 1, "하");
                    break;
                }
                answer[rowIdx][columnIdx] = number++;
                arrayBatch(answer, rowIdx, columnIdx + 1, "우");
                break;
            case "하" :
                if(rowIdx >= answer.length || answer[rowIdx][columnIdx] != 0) {
                    arrayBatch(answer, rowIdx - 1, columnIdx - 1, "좌");
                    break;
                }
                answer[rowIdx][columnIdx] = number++;
                arrayBatch(answer, rowIdx + 1, columnIdx, "하");
                break;
            case "좌" :
                if(columnIdx < 0 || answer[rowIdx][columnIdx] != 0) {
                    arrayBatch(answer, rowIdx - 1,  columnIdx + 1, "상");
                    break;
                }
                answer[rowIdx][columnIdx] = number++;
                arrayBatch(answer, rowIdx, columnIdx - 1, "좌");
                break;
            case "상" :
                if(rowIdx < 0 || answer[rowIdx][columnIdx] != 0) {
                    arrayBatch(answer, rowIdx + 1, columnIdx + 1, "우");
                    break;
                }
                answer[rowIdx][columnIdx] = number++;
                arrayBatch(answer, rowIdx - 1, columnIdx, "상");
                break;
        }

    }
}