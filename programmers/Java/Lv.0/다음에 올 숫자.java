// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int solution(int[] common) {
        int d = 0;
        double r = 0;
        d = common[1] - common[0];
        r = (double) common[1] / common[0];
        if(d == common[2] - common[1]) return common[common.length - 1] + d;
        return common[common.length - 1] * (int) r;
    }
}