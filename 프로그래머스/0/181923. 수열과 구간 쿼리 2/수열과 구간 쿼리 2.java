class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            
            int checkNumber = -1;
            
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                
                if(checkNumber == -1 && arr[j] > queries[i][2]) {
                    checkNumber = arr[j];
                }else if(arr[j] > queries[i][2]) {
                    checkNumber = Math.min(checkNumber, arr[j]);
                }
            }
            
            answer[i] = checkNumber;
        }
        
        return answer;
    }
}