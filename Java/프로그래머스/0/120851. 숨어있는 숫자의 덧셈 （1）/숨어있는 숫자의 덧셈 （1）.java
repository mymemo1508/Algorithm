class Solution {
    public int solution(String my_string) {
        // replaceAll: 정규식과 일치하는 부분을 다른 문자열로 바꾸는 메서드
        // [^0-9]: ^는 제외를 의미
        my_string = my_string.replaceAll("[^0-9]", "");
        // my_string에서 0-9까지 숫자가 아닌 부분을 제거
        
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            // Integer.parseInt: 정수로 변환
            // String.valueOf: 문자열로 변환
            // my_string.charAt(i): my_string을 순회하면서 한 글자씩 문자 값으로 받음
        }
        
        return answer;
    }
}