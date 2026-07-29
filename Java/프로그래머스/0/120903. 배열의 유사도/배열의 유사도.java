/* java에서 값 비교
- [비교주체.equals(비교대상)]: 실제 값이 같은 값인지 확인할 때
- [비교주체 = 비교대상]: 같은 객체를 가리키는 건지 확인할 때
*/
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j <s2.length; j++){
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}