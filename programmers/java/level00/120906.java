// 자릿수 더하기

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}