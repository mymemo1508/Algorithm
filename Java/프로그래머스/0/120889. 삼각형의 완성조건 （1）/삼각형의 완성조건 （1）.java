// 1안
class Solution {
    public int solution(int[] sides) {
        int lng = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int total = 0;
        
        for (int i = 0; i < sides.length; i++) {
            total += sides[i];
        }
        
        int etc = total - lng;
        
        if (lng < etc) {
            return 1;
        } else {
            return 2;
        }
    }
}

// 2안
/*
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        if (sides[0] + sides[1] > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}
*/