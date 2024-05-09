// 중복된 숫자 개수

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
            .filter(num -> num == n)
            .count();
    }
}