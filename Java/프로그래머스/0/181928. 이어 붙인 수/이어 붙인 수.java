class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int i : num_list) {
            if (i % 2 != 0) {
                odd.append(i);
            } else {
                even.append(i);
            }
        }
        
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}