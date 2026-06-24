/*
    정수 n보다 작은 홀수를 오름차순으로 배열에 넣기
    n을 2로 나눠서 나온 몫만큼 1부터 2씩 더해서 반복해서 넣기
*/
class Solution {
    public int[] solution(int n) {
        // int[(배열의 길이)]
        int[] answer = new int[(n + 1) / 2];
        
        int num = 1;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i * 2 + 1;
        }
        
        return answer;
    }
}
