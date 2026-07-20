class Solution {
    public long solution(int a, int b) {
        long start = Math.min(a, b);
        long end = Math.max(a, b);
        
        long answer = (start + end) * (end - start + 1) / 2;
        
        return answer;
    }
}