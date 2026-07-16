class Solution {
    public int solution(int[] dot) {
// 1차 시도

//         int answer = 0;
        
//         if (dot[0] * dot[1] > 0) {
//             if (dot[0] > 0) {
//                 answer = 1;
//             } else {
//                 answer = 3;
//             }
//         } else {
//             if (dot[0] > 0) {
//                 answer = 4;
//             } else {
//                 answer = 2;
//             }
//         }
//         return answer;
        
        if (dot[0] > 0) {
            return dot[1] > 0 ? 1 : 4;
        }
        return dot[1] > 0 ? 2 : 3;
    }
}