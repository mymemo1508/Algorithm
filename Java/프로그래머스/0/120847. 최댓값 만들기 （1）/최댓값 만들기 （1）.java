class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;   // 가장 큰 수
        int max2 = 0;   // 두 번째로 큰 수
        
        for (int number : numbers) {
            if (number > max1) {    // 뽑은 값이 가장 큰 수 보다 크면
                max2 = max1;    // 두 번째 큰 수한테 가장 큰 수 주고,
                max1 = number;  // 뽑은 값을 가장 큰 수로 치환
            } else if (number > max2) { // 뽑은 값이 가장 큰 수 보단 안 큰데, 두 번째로 큰 수 보다 크면
                max2 = number;  // 두 번째로 큰 수로 치환
            }
        }
        
        return max1 * max2;
    }
}