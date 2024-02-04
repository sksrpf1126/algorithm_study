
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int[] check = new int[7];
        
        check[a] += 1;
        check[b] += 1;
        check[c] += 1;
        
        int mode = 0;
        
        for(int value : check) {
            mode = Math.max(mode, value);
        }
        
        if(mode == 1) {
            answer = a + b + c;
        }else if (mode == 2) {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }else if(mode == 3) {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        
        return (int)answer;
    }
}