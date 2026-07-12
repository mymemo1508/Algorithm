class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = n / 2;
        
        for (int i = 1; i <= length; i++) {
            answer += (2 * i);
        }
            
        return answer;
    }
}